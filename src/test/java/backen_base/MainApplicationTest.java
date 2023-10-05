package backen_base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xiaohu
 * @date 2022/07/23/ 15:29
 * @description
 */
@SpringBootTest
@Slf4j
public class MainApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(icu.xiaohu.backend_base.MainApplication.class, args);
    }

    @Test
    public void test(){
        log.info("hello world");
    }
}
