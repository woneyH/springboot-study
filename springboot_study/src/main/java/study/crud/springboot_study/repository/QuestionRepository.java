package study.crud.springboot_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.springboot_study.domain.Question;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Optional<Question> findBySubject(String subject);

    //나중에 기능 확장을 위해 추가적인 연산 기능 where and
    Optional<Question> findBySubjectAndContent(String subject, String content);


}
