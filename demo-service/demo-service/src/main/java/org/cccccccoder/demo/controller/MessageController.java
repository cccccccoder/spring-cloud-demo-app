package org.cccccccoder.demo.controller;

import org.cccccccoder.demo.stream.TestStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyi
 * @date 2016-08-17 14:22
 * @summary:MessageController
 */
//@RequestMapping(value = "message")
//@RestController
public class MessageController {

    @Autowired
    TestStream testStream;

    @RequestMapping(value = "send")
    public void sendMessage() {
        testStream.output().send(MessageBuilder.withPayload("hello!" + System.currentTimeMillis()).build());
    }

    @StreamListener("test-input")
    public void handleMessage(String message) {
        System.out.println("received message:" + message);
    }
}
