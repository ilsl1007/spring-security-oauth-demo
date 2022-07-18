package com.yulj.cloud.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname Oauth2ServerApplication
 * @Description <h1>客户端主启动程序</h1>
 * @Author yulj
 * @Date 2022/07/18 14:52
 */
@SpringBootApplication
public class OAuth2ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ClientApplication.class, args);
    }

}
