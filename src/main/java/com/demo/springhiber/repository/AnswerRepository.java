package com.demo.springhiber.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springhiber.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
	List<Answer> findByQuestionId(Long questionId);
}
