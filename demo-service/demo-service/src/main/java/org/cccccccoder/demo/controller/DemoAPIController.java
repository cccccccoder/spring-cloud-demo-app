package org.cccccccoder.demo.controller;

import org.cccccccoder.demo.service.DemoAPIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyi
 * @date 2016-08-17 14:00
 * @summary:DemoAPIController
 */
@RestController
public class DemoAPIController implements DemoAPIService {

    @Value("${server.port}")
    private int servicePort;

    public String sayHello(String userName) {
        return "hello, " + userName + ", reply from port:" + servicePort;
    }
}
