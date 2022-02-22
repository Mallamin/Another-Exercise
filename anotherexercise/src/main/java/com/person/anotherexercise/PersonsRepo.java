package com.person.anotherexercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepo extends JpaRepository<Persons, Long> {

}
