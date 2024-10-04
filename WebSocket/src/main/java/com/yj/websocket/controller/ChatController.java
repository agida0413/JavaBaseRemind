package com.yj.websocket.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.yj.websocket.dto.ChatDTO;

@RestController
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;

    public ChatController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    // 특정 채팅방으로 메시지를 전달
    @MessageMapping("/chat.sendMessage/{roomId}")
    public void sendMessage(ChatDTO chatMessage, @DestinationVariable String roomId) {
        messagingTemplate.convertAndSend("/topic/" + roomId, chatMessage);
    }

    // 사용자가 채팅방에 참여할 때
    @MessageMapping("/chat.addUser/{roomId}")
    public void addUser(@DestinationVariable String roomId, ChatDTO chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        messagingTemplate.convertAndSend("/topic/" + roomId, chatMessage);
    }
}