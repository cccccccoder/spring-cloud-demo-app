package org.cccccccoder.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author leiyi
 * @date 2016-08-17 13:57
 * @summary:DemoAPIService
 */
@FeignClient("demo-service")
@RequestMapping(value = "/demo-service/api")
public interface DemoAPIService {

    @RequestMapping(value = "say-hello", method = RequestMethod.GET)
    String sayHello(String userName);
}
