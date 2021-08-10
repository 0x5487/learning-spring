package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;

public class JavaConfigBean {
    @Value("${timeout:100}")
    private int timeout;

    public int getTimeout() {
        return timeout;
    }

}
