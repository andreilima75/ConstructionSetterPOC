package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerConstructor implements MessageConsumer {

    private final MessageService messageService;

    @Autowired
    public MessageConsumerConstructor(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String getMessage() {
        return messageService.getMessage();
    }
}
