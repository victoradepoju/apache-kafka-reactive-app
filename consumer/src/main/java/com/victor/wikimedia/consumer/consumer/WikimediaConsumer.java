package com.victor.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the msg from wikimedia-stream Topic:: %s", msg));

        // TODO: Use data received for anything...
    }
}
