package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Constructor Injection
        MessageConsumer constructorConsumer = context.getBean(MessageConsumerConstructor.class);
        System.out.println("Constructor Injection: " + constructorConsumer.getMessage());

        // Setter Injection
        MessageConsumer setterConsumer = context.getBean(MessageConsumerSetter.class);
        System.out.println("Setter Injection: " + setterConsumer.getMessage());
    }
}
