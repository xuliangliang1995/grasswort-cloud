package com.grasswort.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author xuliangliang
 * @Classname SinkReceiver.java
 * @Description
 * @Date 2020/5/11
 * @blame Java Team
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }
}
