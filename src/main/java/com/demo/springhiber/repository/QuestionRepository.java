package com.demo.springhiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springhiber.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>  {
}
