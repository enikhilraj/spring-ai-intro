package edu.nick.springaiintro.services;

import edu.nick.springaiintro.model.Answer;
import edu.nick.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String question);

    Answer getAnswer(Question question);
}
