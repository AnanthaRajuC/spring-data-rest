package io.github.anantharajuc.springdatarest.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="name", nullable = false)
    String name;
}
