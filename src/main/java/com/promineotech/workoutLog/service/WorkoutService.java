package com.promineotech.workoutLog.service;

import java.util.Date;

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
	
	public void deleteWorkout(Long workoutId) {
		repo.delete(workoutId);
	}
	
	public Iterable<Workout> getAllWorkouts() {
		return repo.findAll();
	}
	
	public Workout getWorkout(Long id) {
		return repo.findOne(id);
	}
	
	public Workout updateWorkout(Workout workout, Long id) throws Exception {
		Workout foundWorkout = repo.findOne(id);
		if (foundWorkout == null) {
			throw new Exception("No Workout found.");
		}
		foundWorkout.setContent(workout.getContent());
		return repo.save(foundWorkout);
	}
	
	public Workout createWorkout(Workout workout, Long personId) throws Exception {
		Person person = personRepo.findOne(personId);
		if (person == null) {
			throw new Exception("Person not found.");
		}
		workout.setDate(new Date());
		workout.setPerson(person);
		return repo.save(workout);
	}
	
	
	
}
