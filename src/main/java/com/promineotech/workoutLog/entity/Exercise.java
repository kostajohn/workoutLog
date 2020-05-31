package com.promineotech.workoutLog.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.promineotech.workoutLog.entity.Person;
import com.promineotech.workoutLog.entity.Workout;

@Entity
public class Exercise {
	
	private Long exerciseId;
	private Person person;
	
	@JsonIgnore
	private Workout workout;
	
	private String exerciseName;
	private int numberOfSets;
	private int weight;
	private int reps;
	
	
	
	
	
	
	public String getExerciseName() {
		return exerciseName;
	}
	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}
	public int getNumberOfSets() {
		return numberOfSets;
	}
	public void setNumberOfSets(int numberOfSets) {
		this.numberOfSets = numberOfSets;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getExerciseId() {
		return exerciseId;
	}
	public void setExerciseId(Long exerciseId) {
		this.exerciseId = exerciseId;
	}
	
	@ManyToOne
	@JoinColumn(name = "username")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@ManyToOne
	@JoinColumn(name = "workoutId")
	public Workout getWorkout() {
		return workout;
	}
	public void setWorkout(Workout workout) {
		this.workout = workout;
	}
}
