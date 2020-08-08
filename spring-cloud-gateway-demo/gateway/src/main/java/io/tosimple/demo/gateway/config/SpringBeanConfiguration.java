package io.tosimple.demo.gateway.config;

import io.tosimple.demo.gateway.filter.MyRequestGlobalFilter;
import io.tosimple.demo.gateway.filter.MyRequestGlobalFilter2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class SpringBeanConfiguration {
    @Bean
    public MyRequestGlobalFilter registerMyRequestGlobalFilter(){
        return new MyRequestGlobalFilter();
    }
//    @Bean
//    public MyRequestGlobalFilter2 myRequestGlobalFilter2(){
//        return new MyRequestGlobalFilter2();
//    }

//    @Bean
//    @Order(-1)
//    public GlobalFilter a() {
//        return (exchange, chain) -> {
//            log.info("first pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("third post filter");
//            }));
//        };
//    }
//
//    @Bean
//    @Order(0)
//    public GlobalFilter b() {
//        return (exchange, chain) -> {
//            log.info("second pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("second post filter");
//            }));
//        };
//    }
//
//    @Bean
//    @Order(1)
//    public GlobalFilter c() {
//        return (exchange, chain) -> {
//            log.info("third pre filter");
//            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//                log.info("first post filter");
//            }));
//        };
//    }
}
