package com.compucafe.springsandbox.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class SimpleService {
    private final String serviceName;

    public SimpleService(@Value("${com.compucafe.springsandbox.SimpleService.serviceName}")
                                 String serviceName) {
        this.serviceName = serviceName;
    }

    @PostConstruct
    public void logProperties() {
      log.info("serviceName: " + this.serviceName);
    }
}
