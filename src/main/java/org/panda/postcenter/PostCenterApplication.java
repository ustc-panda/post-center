package org.panda.postcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.panda.postcenter.mapper")
public class PostCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostCenterApplication.class, args);
    }

}
