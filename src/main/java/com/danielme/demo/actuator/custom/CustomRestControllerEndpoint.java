package com.danielme.demo.actuator.custom;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@RestControllerEndpoint(id = "rest-controller")
public class CustomRestControllerEndpoint {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post() {
        //nothing here
    }

}
