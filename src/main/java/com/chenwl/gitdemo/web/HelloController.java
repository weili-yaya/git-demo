package com.chenwl.gitdemo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwl
 * @version V1.0
 * @Description:
 * @date 2017/5/30 13:34
 */

@EnableAutoConfiguration
@RestController
public class HelloController {


    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

}
