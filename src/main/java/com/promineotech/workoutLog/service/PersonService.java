package com.promineotech.workoutLog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.workoutLog.entity.Person;
import com.promineotech.workoutLog.repository.PersonRepository;
//*import com.promineotech.workoutLog.view.Following;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repo;
	
	public Person createPerson(Person person) {
		return repo.save(person);
	}
	
//*login & Password method goes here;
	
//*following method goes here;
	
}
