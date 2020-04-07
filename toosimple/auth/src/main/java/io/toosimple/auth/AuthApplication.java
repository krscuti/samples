package io.toosimple.auth;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
//@EnableFeignClients
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    //用户注册、密码加密、token权限验证
    //

}
