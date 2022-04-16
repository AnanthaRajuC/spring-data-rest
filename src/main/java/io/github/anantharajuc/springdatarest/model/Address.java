package io.github.anantharajuc.springdatarest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.github.anantharajuc.springdatarest.model.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "address")
public class Address extends BaseEntity {
    @Column(name="street", nullable=true)
    String street;

    @Column(name="city", nullable=true)
    String city;

    @Column(name="zipcode", nullable=true)
    String zipcode;

    @JsonBackReference
    @OneToOne(mappedBy="address")
    Person person;
}
