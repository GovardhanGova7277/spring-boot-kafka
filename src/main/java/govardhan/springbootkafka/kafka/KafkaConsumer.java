package govardhan.springbootkafka.kafka;

import govardhan.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer{
    //creating a subscriber method which will subscribe to that topic.

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "messages", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info("Message received successfully {}",message);
    }


    @KafkaListener(topics = "messages_json", groupId = "myGroup")
    public void consume_json(User data){
        LOGGER.info("Json Message is received {}",data);
    }
}
