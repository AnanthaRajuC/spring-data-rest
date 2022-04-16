package io.github.anantharajuc.springdatarest.repository;

import io.github.anantharajuc.springdatarest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="persons")
public interface PersonRepository extends JpaRepository<Person, Long> {
}
