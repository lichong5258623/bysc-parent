package com.chong.byscconsumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.List;

/**
 * 功能说明：
 *
 * @author : lichong
 * @version : 1.0
 * @date : 2018/11/9  15:30
 */
@Configuration
public class RestTemplateConfig {

    /**
     * LoadBalanced实现负载均衡（客户端）
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(ClientHttpRequestFactory clientHttpRequestFactory) {
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        messageConverters.remove(1);
        messageConverters.add(1,new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }

    /**
     * restTemplate的提供者（okHttp,httpClient等等）
     * @return 客户端工厂
     */
    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        //读取超时时间(单位为ms)
        factory.setReadTimeout(5000);
        //连接超时时间(单位为ms)
        factory.setConnectTimeout(5000);
        return factory;
    }

}
