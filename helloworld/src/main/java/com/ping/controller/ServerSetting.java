package com.ping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-19 22:21
 */
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "test")
public class ServerSetting {

   // @Value("${name}")
    private String name;

   // @Value("${domain}")
    private String domain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "ServerSetting{" +
                "name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
