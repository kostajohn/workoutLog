package com.promineotech.workoutLog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.workoutLog.entity.Exercise;
import com.promineotech.workoutLog.service.ExerciseService;

@RestController
@RequestMapping("persons/{personId}/workouts/{workoutId}/exercises")
public class ExerciseController {
	
	@Autowired
	private ExerciseService service;
	
/**	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> createExercise(@RequestBody Exercise exercise, @PathVariable Long personId, @PathVariable Long workoutId) {
		try {
			return new ResponseEntity<Object>(service.createExercise(exercise, personId, workoutId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HtttpStatus.BAD_REQUEST);
		}
	}
*/

	@RequestMapping(value="/{exerciseId}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteComment(@PathVariable Long exerciseId) {
		service.deleteExercise(exerciseId);
		return new ResponseEntity<Object>("Deleted exercise " + exerciseId, HttpStatus.OK);
	}


}


//* not sure what to put here yet. This class may not be necessary at all.