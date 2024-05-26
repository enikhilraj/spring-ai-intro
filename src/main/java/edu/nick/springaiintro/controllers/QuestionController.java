package edu.nick.springaiintro.controllers;

import edu.nick.springaiintro.model.Answer;
import edu.nick.springaiintro.model.Question;
import edu.nick.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question  question) {
        return openAIService.getAnswer(question);
    }
}
