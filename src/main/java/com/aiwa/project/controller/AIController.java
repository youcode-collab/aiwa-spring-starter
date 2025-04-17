package com.aiwa.project.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiwa.project.service.impl.AIServiceImpl;

@RestController
@RequestMapping("/api/v1/ai")
public class AIController {
    private final AIServiceImpl aiService;
    public AIController(AIServiceImpl aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/generate")
    public ResponseEntity<Map<String, String>> generate() {
        String response = aiService.testFunction();
        return ResponseEntity.ok(Map.of("response", response));
    }
}
