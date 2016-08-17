package org.cccccccoder.demo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author leiyi
 * @date 2016-08-17 14:23
 * @summary:TestStream
 */
public interface TestStream {

    @Input("test-input")
    SubscribableChannel input();

    @Output("test-output")
    MessageChannel output();
}
