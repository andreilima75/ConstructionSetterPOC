package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("=== Constructor Injection ===");
            ConstructorInjectedClient constructorClient =
                    context.getBean(ConstructorInjectedClient.class);
            //constructorClient.process();

            System.out.println("\n=== Setter Injection ===");
            SetterInjectedClient setterClient =
                    context.getBean(SetterInjectedClient.class);
            setterClient.process();
        }
    }
}