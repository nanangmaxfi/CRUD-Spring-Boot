package id.nanangmaxfi.springdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.nanangmaxfi.springdemo.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
	List<Answer> findByQuestionId(Long questionId);
}
