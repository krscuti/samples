package io.tosimple.demo.auth;

import io.tosimple.demo.common.feign.annotation.EnablePigxFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
//@EnableFeignClients
//@SpringBootApplication
//@EnableDiscoveryClient
@EnablePigxFeignClients
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}