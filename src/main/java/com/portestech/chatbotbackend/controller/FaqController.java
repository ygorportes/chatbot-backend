package com.portestech.chatbotbackend.controller;

import com.portestech.chatbotbackend.dto.MessageRequest;
import com.portestech.chatbotbackend.util.FaqAnswers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class FaqController {

    @PostMapping
    public ResponseEntity<String> answerQuestion(@RequestBody MessageRequest request) {
        FaqAnswers faqAnswers = new FaqAnswers();
        return ResponseEntity.ok("Your answer is: it worked out");
    }
}
