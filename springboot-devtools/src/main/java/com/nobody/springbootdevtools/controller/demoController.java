package com.nobody.springbootdevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Mr.nobody
 * @date 2020/8/20
 */
@RestController
public class demoController {

    @GetMapping("demo")
    public String demo() {
        return "Hello World!";
    }

}
