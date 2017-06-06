package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yuxuanwang on 2017/6/6.
 */
@Service
public class SomeBusiness {

    @Resource
    private Map<String, String> configGroup;

    @PostConstruct
    private void init() {
        System.out.print(configGroup);
    }

    public void someMethod() {
        //Do your business with config from configGroup
    }

}
