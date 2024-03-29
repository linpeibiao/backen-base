package icu.xiaohu.backend_base.intercepter;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import icu.xiaohu.backend_base.model.entity.User;
import icu.xiaohu.backend_base.exception.BusinessException;
import icu.xiaohu.backend_base.model.result.ResultCode;
import icu.xiaohu.backend_base.util.UserHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static icu.xiaohu.backend_base.constant.RedisConstant.LOGIN_USER_KEY;


/**
 * @author xiaohu
 * @date 2022/11/19/ 16:55
 * @description 登录拦截器。
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("登录拦截器被执行");
        if ("OPTIONS".equals(request.getMethod())) {
            return true;
        }
        String url = request.getRequestURI();
        if (url.contains("login") || url.contains("sendCode") || url.contains("register")){
            return true;
        }
        // 1.判断是否需要拦截（缓存中是否有用户）
        String token = request.getHeader("token");
        if (StringUtils.isBlank(token)){
            throw new BusinessException(ResultCode.NOT_LOGIN, "未登录");
        }

        // 先从 redis 中拿到登录信息，若数据为空，返回false
        Map<Object, Object> userMap = stringRedisTemplate.opsForHash().entries(token);
        // 判断 userMap
        if (userMap.isEmpty()){
            throw new BusinessException(ResultCode.NOT_LOGIN, "未登录");
        }
        // 将 map 转换成 User 实体
        User user = BeanUtil.fillBeanWithMap(userMap, new User(), false);
        // 将 USer 保存在 UserHolder
        UserHolder.save(user);
        // 有用户，则放行
        log.info("存在登录用户");
        return true;
    }

}
