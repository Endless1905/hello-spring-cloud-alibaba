package io.endless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Endless1905
 * @version 1.0.0
 * @date 2019/6/2 22:42
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerFeignApplication.class, args);
    }
}
