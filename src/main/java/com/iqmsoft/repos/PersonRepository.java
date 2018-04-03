package com.iqmsoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String name);
    Optional<Person> findById(Long id);
    List<Person> findAll();
}