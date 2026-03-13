package com.studentportal.studentproject_restapijpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "StudentId")
    private Integer studentId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Major")
    private String major;
}