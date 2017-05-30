package com.chenwl.gitdemo.web.main;

import com.chenwl.gitdemo.web.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cwl
 * @version V1.0
 * @Description:
 * @date 2017/5/30 13:43
 */
@SpringBootApplication
public class Application {

    public static void main(String[] a){
        SpringApplication.run(HelloController.class,a);
    }

}
