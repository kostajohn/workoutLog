package com.promineotech.workoutLog.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.workoutLog.entity.Person;

public interface PersonRepository extends CrudRepository<Long, Person> {
	
	public Person name findbyName(String, Name);

}
