package io.endless.controller;

import io.endless.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Endless1905
 * @version 1.0.0
 * @date 2019/6/2 23:06
 */
@RestController
public class NacosProviderController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo")
    public String echo() {
        return nacosProviderService.echo("hello Feign");
    }
}
