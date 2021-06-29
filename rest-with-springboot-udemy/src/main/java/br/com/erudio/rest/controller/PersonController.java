package br.com.erudio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.rest.model.Person;
import br.com.erudio.rest.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable("id") String id) {
		return personService.findById(id);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) {
		return personService.create(person);
	}
	
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) {
		return personService.update(person);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable("id") String id) {
		personService.delete(id);
	}
	
}