package com.grasswort.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuliangliang
 * @Classname HelloController.java
 * @Description
 * @Date 2020/5/10
 * @blame Java Team
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/services")
    public String index() {
        return discoveryClient.getServices().stream().reduce((a, b) -> a + "," + b).orElse("暂无服务");
    }
}
