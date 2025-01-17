package io.plainid.invicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class InvicesDemoApplication{

    public static void main(String[] args) {
        SpringApplication.run(InvicesDemoApplication.class, args);
    }
}
