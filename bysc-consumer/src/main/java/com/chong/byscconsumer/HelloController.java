package com.chong.byscconsumer;

import com.chong.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能说明：
 *
 * @author : <a href="mailto:lichong@zjport.gov.cn">lichong</a>
 * @version : 1.0
 * @date : 2018/11/9  16:38
 */
@RestController
public class HelloController {

    //使用服务名
    private static final String REST_URL_PREFIX = "http://BYSCPROVIDER";


    @Autowired
    RestTemplate restTemplate;

    //Fegin服务接口
    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/hello", String.class);
    }

    @GetMapping("/helloFegin")
    public String helloFegin(){
        return testService.getHello();
    }

}
