package com.mobiversite.live.question.Service;


import com.mobiversite.live.question.Model.Answer;
import com.mobiversite.live.question.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AnswerService {


    @Autowired
    AnswerRepository answerRepository;


    public void addAnswers (int questionId,int rightAnswer){
        Answer answer = new Answer();
        String uuid = UUID.randomUUID().toString();
        answer.setId(uuid);
        answer.setQuestionId(questionId);
        answer.setRightAnswer(rightAnswer);
        answerRepository.save(answer);
    }
    public int getAnswer(int questionId){
        Answer answer = answerRepository.findByQuestionId(questionId);
        if (answer!=null){
            return (answer.getRightAnswer());
        }else {
            return 0;
        }
    }


}
