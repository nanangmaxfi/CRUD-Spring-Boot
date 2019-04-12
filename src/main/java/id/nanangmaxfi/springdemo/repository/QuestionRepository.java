package id.nanangmaxfi.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.nanangmaxfi.springdemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
