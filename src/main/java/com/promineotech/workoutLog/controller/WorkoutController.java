package com.promineotech.workoutLog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.workoutLog.entity.Workout;
import com.promineotech.workoutLog.service.WorkoutService;


@RestController
@RequestMapping("/persons/{username}/workouts")
public class WorkoutController {

	@Autowired
	private WorkoutService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getAllWorkouts() {
		return new ResponseEntity<Object>(service.getAllWorkouts(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{workoutId}", method=RequestMethod.GET)
	public ResponseEntity<Object> getWorkout(@PathVariable Long workoutId) {
		return new ResponseEntity<Object>(service.getWorkout(workoutId), HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/{workoutId}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateWorkout(@RequestBody Workout workout, @PathVariable Long workoutId) {
		try {
			return new ResponseEntity<Object>(service.updateWorkout(workout, workoutId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.POST)
	public ResponseEntity<Object> createWorkout(@RequestBody Workout workout, @PathVariable Long userId) {
		try {
			return new ResponseEntity<Object>(service.createWorkout(workout, userId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
}
