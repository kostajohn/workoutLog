package com.promineotech.workoutLog.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.workoutLog.entity.Workout;
import com.promineotech.workoutLog.entity.Person;
import com.promineotech.workoutLog.repository.PersonRepository;
import com.promineotech.workoutLog.repository.WorkoutRepository;



@Service
public class WorkoutService {

	@Autowired
	private WorkoutRepository repo;
	
	@Autowired
	private PersonRepository personRepo;
	
	public void deleteWorkout(Long workoutId) {
		repo.delete(workoutId);
	}
	
	public Iterable<Workout> getAllWorkouts() {
		return repo.findAll();
	}
	
	public Workout getWorkout(Long workoutId) {
		return repo.findOne(workoutId);
	}
	
	public Workout updateWorkout(Workout workout, Long workoutId) throws Exception {
		Workout foundWorkout = repo.findOne(workoutId);
		if (foundWorkout == null) {
			throw new Exception("No Workout found.");
		}
		foundWorkout.setExercises(workout.getExercises());
		return repo.save(foundWorkout);
	}
	
	public Workout createWorkout(Workout workout, Long username) throws Exception {
		Person person = personRepo.findOne(username);
		if (person == null) {
			throw new Exception("Person not found.");
		}
		workout.setDate(new Date());
		workout.setPerson(person);
		return repo.save(workout);
	}
	
	
	
}
