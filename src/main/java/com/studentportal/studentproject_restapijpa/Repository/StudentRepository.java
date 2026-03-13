package com.studentportal.studentproject_restapijpa.Repository;
import com.studentportal.studentproject_restapijpa.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
