package icu.xiaohu.backend_base.util;

import cn.hutool.core.bean.BeanUtil;
import icu.xiaohu.backend_base.exception.BusinessException;
import icu.xiaohu.backend_base.model.entity.User;
import icu.xiaohu.backend_base.model.result.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static icu.xiaohu.backend_base.constant.RedisConstant.LOGIN_USER_KEY;

/**
 * @author xiaohu
 * @date 2022/11/09/ 16:10
 * @description 保存用户登录
 */
@Slf4j
public class UserHolder<T> {
    @Autowired
    private static StringRedisTemplate stringRedisTemplate;
    private static final ConcurrentHashMap<String, String> userMap = new ConcurrentHashMap();

    public static void save(String account, String token) {
        log.info(Thread.currentThread().getName() + "保存登陆用户信息");
        userMap.put(account, token);
    }

    public static String getToken(String account){
        return userMap.get(account);
    }

    public static User get(String account) {
        log.info(Thread.currentThread().getName() + "获取登陆用户信息");
        String token = userMap.get(account);
        if (StringUtils.isEmpty(token)){
            return null;
        }
        String tokenKey = LOGIN_USER_KEY + token;

        // 先从 redis 中拿到登录信息，若数据为空，返回false
        Map<Object, Object> userMap = stringRedisTemplate.opsForHash().entries(tokenKey);
        // 判断 userMap
        if (userMap.isEmpty()) {
            // 保存了空值，将该key删除
            stringRedisTemplate.opsForHash().delete(tokenKey);
            return null;
        }
        // 将 map 转换成 User 实体
        return BeanUtil.fillBeanWithMap(userMap, new User(), false);
    }

    public static void remove(String account) {
        userMap.remove(account);
    }
}
