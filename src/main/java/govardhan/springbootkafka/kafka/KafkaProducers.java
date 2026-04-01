package govardhan.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducers {
    public static Logger LOGGER = LoggerFactory.getLogger(KafkaProducers.class);

    //to create kafka topic we will use kafka template that is provided by the spring
    //It’s a Spring Kafka class that helps you send messages to Kafka easily.
    private final KafkaTemplate<String,String> kafkaTemplate;

    //inorder to inject the variable we are creating the constructor to inject the kafkatemplate
    public KafkaProducers(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void messages(String message){
        LOGGER.info("Message sent {}", message);
        kafkaTemplate.send("messages",message);
    }
}
