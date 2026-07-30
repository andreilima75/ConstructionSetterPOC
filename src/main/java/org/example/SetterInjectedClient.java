package org.example;


public class SetterInjectedClient {

    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void process() {
        if (messageService == null) {
            System.out.println("[Setter] No MessageService injected!");
            return;
        }
        System.out.println("[Setter] " + messageService.getMessage());
    }
}