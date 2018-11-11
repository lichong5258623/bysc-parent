package com.chong.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "http://BYSCPROVIDER")
public interface TestService {

    @GetMapping("/test/hello")
    public String getHello();


}
