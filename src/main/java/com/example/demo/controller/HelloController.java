package com.example.demo.controller;

/**
 * @author Pang
 * @date 2020/11/25
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String str){
        return "hello "+str;
    }
}