package io.tosimple.demo.gateway.healthcheck;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheck {
    @RequestMapping(value = "/healthCheck",method = RequestMethod.GET)
    public String healthCheck() {
//        log.info("==========, healthCheck 服务状态检查被调用了");
        return "ok";
    }
}
