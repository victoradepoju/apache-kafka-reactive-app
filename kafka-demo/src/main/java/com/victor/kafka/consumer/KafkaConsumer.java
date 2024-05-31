package com.victor.kafka.consumer;

import com.victor.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "victor", groupId = "myGroup")
    public void consumeMessage(/*String msg*/ Student student) {
      log.info(String.format("Consuming the msg from victor Topic:: %s", student.toString()));
    }
}
