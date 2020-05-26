package com.example.codeclan.quizservice.repositories;

import com.example.codeclan.quizservice.models.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
}
