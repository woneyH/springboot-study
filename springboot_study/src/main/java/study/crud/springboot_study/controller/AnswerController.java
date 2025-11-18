package study.crud.springboot_study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import study.crud.springboot_study.dto.QuestionResponse;
import study.crud.springboot_study.service.QuestionService;

@Controller
@RequestMapping("/answer")
@RequiredArgsConstructor
public class AnswerController {
    private final QuestionService questionService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable Long id,
                               @RequestParam String content) {
        QuestionResponse question = questionService.getQuestion(id);
        //TODO: 답변 저장 기능 나중에 구현 예정
        return String.format("redirect:/question/detail/%s", id);
    }

}
