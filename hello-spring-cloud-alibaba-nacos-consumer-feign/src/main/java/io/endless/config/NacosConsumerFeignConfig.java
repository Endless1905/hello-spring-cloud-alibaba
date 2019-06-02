package io.endless.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Endless1905
 * @version 1.0.0
 * @date 2019/6/2 22:43
 */
@Configuration
public class NacosConsumerFeignConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
