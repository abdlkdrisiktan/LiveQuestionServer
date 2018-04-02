package com.mobiversite.live.question.Controller;

import com.mobiversite.live.question.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    AnswerService answerService;


    @PostMapping(value = "addAnswer")
    @ResponseBody
    public void addAnswers (@RequestParam (value = "questionId")int questionId,@RequestParam(value = "rightAnswer")int rightAnswer){
        answerService.addAnswers(questionId,rightAnswer);
    }

    @GetMapping(value = "getAnswer")
    @ResponseBody
    public int getAnswer(@RequestParam(value = "questionId")int questionId){
        return answerService.getAnswer(questionId);
    }


}
