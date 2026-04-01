package govardhan.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration // this class will act as a configuration class and will run this class when I start running the application
public class KafkaTopicConfig {
    @Bean
    //bean is handled by the spring and creates the object that you need and manages by the spring the return tyoe it will store and we can use whenver we want Please create an object of this method’s return type and manage it yourself. I want to use it in other parts of the application.
    public NewTopic firstTopic(){
        return TopicBuilder.name("messages").build();
    }

    @Bean
    public NewTopic secondTopic(){
        return TopicBuilder.name("messages_json").build();
    }
}


