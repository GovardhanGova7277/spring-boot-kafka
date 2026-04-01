package govardhan.springbootkafka.controller;

import govardhan.springbootkafka.kafka.KafkaProducers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private final KafkaProducers kafkaProducer;

    public MessageController(KafkaProducers kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    //https:localhost:8080/api/v1/kafka/publish?message=hello gova
    @GetMapping("/publish")
    public ResponseEntity<String> publish (@RequestParam("message")String message){
        kafkaProducer.messages(message);
        return ResponseEntity.ok("Message sent to Kafka topic successfully!");
    }
}
