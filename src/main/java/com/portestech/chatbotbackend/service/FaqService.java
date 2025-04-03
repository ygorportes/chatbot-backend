package com.portestech.chatbotbackend.service;

import com.portestech.chatbotbackend.domain.FaqAnswer;
import com.portestech.chatbotbackend.util.FaqAnswers;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FaqService {

    private final FaqAnswers faqAnswers = new FaqAnswers();

    public String getAnswer(String question) {

        String[] words = question.toLowerCase().split("\\s+");
        List wordsList = Arrays.asList(words);

        for (FaqAnswer entry : faqAnswers.getAnswers()) {
            for (String keyword : entry.getKeywords()) {
                if (wordsList.contains(keyword)) {
                    return entry.getAnswer();
                }
            }
        }

        return faqAnswers.getDefaultAnswer();
    }
}
