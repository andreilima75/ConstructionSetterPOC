package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedClient {
    private final MessageService messageService;

    @Autowired
    public ConstructorInjectedClient(MessageService messageService) {
        this.messageService = messageService;
    }
}