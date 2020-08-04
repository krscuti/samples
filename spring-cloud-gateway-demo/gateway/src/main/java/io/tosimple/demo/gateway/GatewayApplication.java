package io.tosimple.demo.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
//        System.setProperty("nacos.standalone", "true");
        SpringApplication.run(GatewayApplication.class, args);
        log.info("==========，gateway启动了");
    }

}
