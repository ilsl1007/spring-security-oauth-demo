package com.yulj.cloud.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname HelloController
 * @Description <h1>资源服务器（用户服务）主启动程序</h1>
 * @Author yulj
 * @Date 2022/07/18 15:27
 */
@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
