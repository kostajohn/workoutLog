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
	
	public Person login(Person person) throws Exception {
		Person foundPerson = repo.findByUsername(person.getusername());
		if (foundPerson != null && foundPerson.getPassword().contentEquals(person.getPassword())) {
			return foundPerson;
		} else {
			throw new Exception("Invalid username or password.");
		}
	}
	
//*following method goes here, if follower function added;
	
}
