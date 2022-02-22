package com.person.anotherexercise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PesrsonsController {
	@Autowired
	private PersonsRepo personsRepo;

	@GetMapping("/")
	public String getEntity() {
		return "Welcome";
	}

	@PostMapping("/persons")
	public void savePersons(@RequestBody List<Persons> persons) {
		personsRepo.saveAll(persons);

	}
	
//	List<Persons> persons=personsRepo.findAll()
//			
//			for (Persons person:persons) {
//				personsRepo.deleteAll(persons);}
//			}
	
	
		
	
	
	@PostMapping("/persons/{id}")
	public void deletePersons(@RequestBody List<Long> id) {
		List<Persons> deletePersons = personsRepo.findAllById(id);
		
//		if (deletePersons.isEmpty()) {
//			throw new RuntimeException("Person not found");
//		}
		
		for(Persons persons : deletePersons) {
			personsRepo.delete(persons);
		}
			
			
		
		
		
		

//		personsRepo.deleteAllById(id);
		//(deletePersons.get(0));
		
}}
