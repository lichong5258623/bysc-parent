package com.chong.byscprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明：
 *
 * @author : <a href="mailto:lichong@zjport.gov.cn">lichong</a>
 * @version : 1.0
 * @date : 2018/11/9  14:53
 */
@RestController
@RequestMapping("/test")
public class HelloController {


    private Logger log = LoggerFactory.getLogger(getClass());




    @GetMapping("/hello")
    public String hello(){
        return "helloEureka";
    }


}
