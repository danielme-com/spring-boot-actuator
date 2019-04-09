package com.danielme.demo.actuator.info;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class OSInfoContributor implements InfoContributor {

    @Override
    public void contribute(Builder builder) {
        builder.withDetail("os", System.getProperty("os.name"));
    }

}
