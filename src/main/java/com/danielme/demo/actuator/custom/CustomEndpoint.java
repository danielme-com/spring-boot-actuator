package com.danielme.demo.actuator.custom;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {

    @ReadOperation
    public Map<String, Object> infoAll() {
        Map<String, Object> info = new LinkedHashMap<>();
        info.put("param1", 2);
        info.put("param2", "value 2");
        return info;
    }
    
    @ReadOperation
    public Map<String, Object> info(@Selector String selector) {
        Map<String, Object> info = new LinkedHashMap<>();
        info.put(selector, "value for " + selector);
        return info;
    }

}
