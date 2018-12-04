package com.wnn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wnn
 * @date 2018/11/30 11:36
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    String home() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
