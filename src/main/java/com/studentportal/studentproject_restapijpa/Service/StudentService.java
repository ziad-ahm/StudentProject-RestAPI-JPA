package com.studentportal.studentproject_restapijpa.Service;

import com.studentportal.studentproject_restapijpa.Entity.Student;
import com.studentportal.studentproject_restapijpa.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository Repo;

    public List<Student> findAll(){
        return Repo.findAll();
    }

    public Student findById(int id){
        return Repo.findById(id) .orElse(null);
    }

    public Student save_update(Student student) {
        return Repo.save(student);
    }

    public void Delete(int id) {
         Repo.deleteById(id);
    }

}
