package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

    @Bean
    public MessageConsumerConstructor constructorConsumer(MessageService messageService) {
        return new MessageConsumerConstructor(messageService);
    }

    @Bean
    public MessageConsumerSetter setterConsumer(MessageService messageService) {
        return new MessageConsumerSetter(messageService);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Constructor Injection
        MessageConsumerConstructor constructorConsumer = context.getBean(MessageConsumerConstructor.class);
        System.out.println("Constructor Injection: " + constructorConsumer.getMessage());
        
        // Setter Injection
        MessageConsumerSetter setterConsumer = context.getBean(MessageConsumerSetter.class);
        System.out.println("Setter Injection: " + setterConsumer.getMessage());
    }
}
