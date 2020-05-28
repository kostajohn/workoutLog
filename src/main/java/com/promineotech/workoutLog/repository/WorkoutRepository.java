package com.promineotech.workoutLog.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.workoutLog.entity.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long>{

	
}
