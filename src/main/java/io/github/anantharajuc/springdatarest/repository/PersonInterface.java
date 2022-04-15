package io.github.anantharajuc.springdatarest.repository;

import io.github.anantharajuc.springdatarest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInterface extends JpaRepository<Person, Long> {
}
