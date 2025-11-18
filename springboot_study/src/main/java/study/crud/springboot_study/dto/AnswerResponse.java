package study.crud.springboot_study.dto;

import study.crud.springboot_study.domain.Answer;

import java.time.LocalDateTime;

public record AnswerResponse (
        Long id,
        String content,
        LocalDateTime createDate
) {
    public static AnswerResponse from(Answer answer) {
        return new AnswerResponse(
                answer.getId(),
                answer.getContent(),
                answer.getCreateDate()
        );
    }
}