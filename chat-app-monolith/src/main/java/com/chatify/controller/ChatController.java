package com.chatify.controller;

import com.chatify.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")       // Clients send to /app/chat
    @SendTo("/topic/messages")     // Broadcast to all subscribers
    public ChatMessage send(ChatMessage message) {
        return message;
    }
}