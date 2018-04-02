package com.mobiversite.live.question.Repository;

import com.mobiversite.live.question.Model.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;

public  interface  AnswerRepository extends MongoRepository<Answer,String> {

    Answer findByRightAnswer(int rightAnswer);
}
