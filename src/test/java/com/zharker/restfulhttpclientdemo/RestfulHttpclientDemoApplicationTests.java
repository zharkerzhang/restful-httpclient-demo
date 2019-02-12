package com.zharker.restfulhttpclientdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulHttpclientDemoApplicationTests {

    @Autowired
    private RestTemplate restfulHttpClientTemplate;

    @Test
    public void contextLoads() {

        String url = "http://www.zharker.com";
        String result = restfulHttpClientTemplate.getForObject(url,String.class);
        System.out.println(result);
    }

}

