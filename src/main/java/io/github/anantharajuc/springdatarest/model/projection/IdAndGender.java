package io.github.anantharajuc.springdatarest.model.projection;

import io.github.anantharajuc.springdatarest.model.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "idAndGender", types={Person.class})
public interface IdAndGender {
  Long getId();
  String getGender();
}
