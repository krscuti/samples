package io.tosimple.demo.gateway;

import io.tosimple.demo.common.gateway.annotation.EnablePigxDynamicRoute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.SpringCloudApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringCloudApplication(@EnableDiscoveryClient + @EnableCircuitBreaker)
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
//@EnablePigxDynamicRoute
//@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
//        System.setProperty("nacos.standalone", "true");
        SpringApplication.run(GatewayApplication.class, args);
        log.info("==========，gateway启动了");
    }

}
