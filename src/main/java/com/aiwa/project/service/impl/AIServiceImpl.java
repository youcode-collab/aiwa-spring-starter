package com.aiwa.project.service.impl;

import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

import com.aiwa.project.service.AIService;

@Service
public class AIServiceImpl implements AIService{
        private final ChatClient chatClient;

        public AIServiceImpl(ChatClient.Builder chatClient) {
            this.chatClient = chatClient.build();
        }
        @Override
        public String testFunction() {
            SystemMessage systemMessage = new SystemMessage("You are a helpful AI assistant.");
            UserMessage userMessage = new UserMessage("why ai and coding are good for humanity");
            Prompt prompt = new Prompt(List.of(systemMessage, userMessage));
            return chatClient.prompt(prompt).call().content();
        }
}
