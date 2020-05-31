package com.promineotech.workoutLog.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.workoutLog.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	public Person findByUsername(String username);

}
