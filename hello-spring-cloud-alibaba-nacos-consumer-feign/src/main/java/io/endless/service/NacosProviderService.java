package io.endless.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Endless1905
 * @version 1.0.0
 * @date 2019/6/2 23:03
 */
@FeignClient(name = "nacos-provider")
public interface NacosProviderService {

    @GetMapping(value = "/echo/{name}")
    String echo(@PathVariable String name);
}
