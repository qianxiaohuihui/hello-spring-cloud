package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * http://localhost:8765/hi?msg=55555
 * 可观察到负载均衡效果，Feign默认集成了该功能
 * */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }

}
