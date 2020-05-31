package com.promineotech.workoutLog.entity;

import java.util.Date;
import java.util.Set;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

//*A 'workout' will consist of 4 exercises

@Entity
public class Workout {

	private Long workoutId;
	private List<Exercise> exercises;
	private Date date;
	private Person person;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
	}

	/** should this be ManyToMany and mappedBy = "Exercise"?*/
	@ManyToMany(mappedBy = "workout")
	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@ManyToOne
	@JoinColumn(name = "username")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}

//*A 'workout' will consist of 4 exercises