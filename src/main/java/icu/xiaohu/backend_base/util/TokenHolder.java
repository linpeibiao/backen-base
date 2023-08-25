package icu.xiaohu.backend_base.util;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiaohu
 * @date 2023/08/26/ 0:12
 * @description
 */
@Slf4j
public class TokenHolder {
    /**
     * 保存用户登录时生成的token
     */
    private static ConcurrentHashMap<String, String> tokens = new ConcurrentHashMap<>();

    public static void setToken(String account, String token){
        tokens.put(account, token);
    }

    public static String getToken(String account){
        return tokens.get(account);
    }
}
