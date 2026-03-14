package com.studentportal.studentproject_restapijpa.Controller;

import com.studentportal.studentproject_restapijpa.Entity.Student;
import com.studentportal.studentproject_restapijpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService Service;

    @GetMapping("/students")
    public List<Student> findAll(){
        return Service.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findById( @PathVariable("id") int id) {
        return Service.findById(id);
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return Service.save_update(student);
    }

    @PutMapping("/students/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {

        student.setStudentId(id);

        return Service.save_update(student);
    }

    @DeleteMapping("/students/{id}")
    public void Delete( @PathVariable("id") int id) {
        Service.Delete(id);
    }

}
