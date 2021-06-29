package br.com.erudio.rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.rest.model.Person;
import br.com.erudio.rest.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private final AtomicLong counter = new AtomicLong();
	
	@Override
	public Person findById(String id) {
		Person person = mockPerson(1);
		return person;
	}

	@Override
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		for ( int i = 0; i < 8; i++ ) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i); 
		person.setLastName("Junior");
		person.setAddress("Rua Catanduva, São Paulo - SP, Brasil");
		person.setGender("Male");
		return person;
	}

	@Override
	public Person create(Person person) {
		return person;
	}

	@Override
	public Person update(Person person) {
		return person;
	}

	@Override
	public void delete(String id) {
		
	}
	
	
	
}
