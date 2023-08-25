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
    private static final ThreadLocal<User> tl = new ThreadLocal();

    public static void save(User user) {
        log.info(Thread.currentThread().getName() + "保存登陆用户信息");
        tl.set(user);
    }


    public static User get() {
        log.info(Thread.currentThread().getName() + "获取登陆用户信息");
        return tl.get();
    }

    public static void remove(String account) {
        tl.remove();
    }
}
