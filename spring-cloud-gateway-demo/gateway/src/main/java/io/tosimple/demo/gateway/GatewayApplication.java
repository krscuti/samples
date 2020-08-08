package io.tosimple.demo.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = TransactionAutoConfiguration.class)
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
//@SpringCloudApplication(same with @SpringBootApplication + @EnableDiscoveryClient + @EnableCircuitBreaker
public class GatewayApplication {

    public static void main(String[] args) {
//       System.setProperty("nacos.standalone", "true");
        SpringApplication.run(GatewayApplication.class, args);
        log.info("==========，gateway启动了");

        //rules of gateway
        //1. request with token -> filer -> service route
        //2. request without token -> search public route find target route or deny (public route)
        //3. request without token -> auth | to get a access token, then route to target service
        //4. all request though filter, log and custom request

        //all request go auth first to request authentication with token

    }

}
