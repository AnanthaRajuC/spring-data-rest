package io.github.anantharajuc.springdatarest.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="person")
public class Person extends BaseEntity {

    @Column(name="name", nullable = false)
    String name;
}
