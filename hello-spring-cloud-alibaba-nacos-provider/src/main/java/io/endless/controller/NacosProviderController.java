package io.endless.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Endless1905
 * @version 1.0.0
 * @date 2019/6/2 22:27
 */
@RestController
public class NacosProviderController {

    @GetMapping(value = "/echo/{name}")
    public String echo(@PathVariable String name) {
        return "Hello Nacos " + name;
    }
}
