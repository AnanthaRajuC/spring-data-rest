package io.github.anantharajuc.springdatarest.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.anantharajuc.springdatarest.model.common.BaseEntity;
import io.github.anantharajuc.springdatarest.model.enums.Gender;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="person")
public class Person extends BaseEntity {

    @JsonProperty("first_name")
    @Column(name="first_name", nullable = false)
    String firstName;

    @Column(name="last_name", nullable = false)
    String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    Gender gender;

    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name="address_id")
    Address address;
}
