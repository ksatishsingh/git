package com.example.springboot.springbootbackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id")
    private String emailId;
}
