package icu.xiaohu.backend_base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaohu
 * @date 2023/03/23/ 22:28
 * @description
 */

@SpringBootApplication
@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        log.info("hello world! 你好，世界！");
    }
}

