package org.cccccccoder.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author leiyi
 * @date 2016-08-17 13:58
 * @summary:DemoServiceApplication
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().web(false).sources(DemoServiceApplication.class).build().run(args);
    }
}
