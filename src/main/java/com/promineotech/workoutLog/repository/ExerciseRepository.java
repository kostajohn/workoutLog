package com.promineotech.workoutLog.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.workoutLog.entity.Exercise;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

}
