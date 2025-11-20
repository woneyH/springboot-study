package study.crud.springboot_study.exception.question_exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class GlobalQuestionExceptionHandler {
    @ExceptionHandler(QuestionException.class)
    public String handleQuestionException(QuestionException e, Model model) {
        log.error("QuestionException 발생: {}",e.getMessage(),e);

        model.addAttribute("errorMessage",e.getMessage());
        model.addAttribute("errorCode",e.getStatus());
        model.addAttribute("timestamp", LocalDateTime.now());
        return "error";
    }
}
