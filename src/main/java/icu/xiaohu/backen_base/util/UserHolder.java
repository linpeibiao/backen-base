package icu.xiaohu.backen_base.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaohu
 * @date 2022/11/09/ 16:10
 * @description 保存用户登录
 */
@Slf4j
public class UserHolder<T> {
    private static final ThreadLocal<Object> tl = new ThreadLocal<>();
    public static void save(Object user){
        log.info(Thread.currentThread().getName() + "保存登陆用户信息");
        tl.set(user);
    }
    public static Object get(){
        log.info(Thread.currentThread().getName() + "获取登陆用户信息");
        return tl.get();
    }
    public static void remove(){
        tl.remove();
    }
}
