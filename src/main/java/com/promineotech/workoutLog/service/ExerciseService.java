package com.promineotech.workoutLog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.workoutLog.repository.ExerciseRepository;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepository repo;
	
	public void deleteExercise(Long exerciseId) {
		repo.delete(exerciseId);
	}
}
