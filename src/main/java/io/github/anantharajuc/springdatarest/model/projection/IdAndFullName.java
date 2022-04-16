package io.github.anantharajuc.springdatarest.model.projection;

import io.github.anantharajuc.springdatarest.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "idAndFullName", types = { Person.class })
public interface IdAndFullName {
  Long getId();

  @Value("#{target.firstName}"+" "+"#{target.lastName}")
  String getFullName();
}
