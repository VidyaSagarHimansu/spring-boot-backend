package org.testspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.testspring.Model.Student;
import org.testspring.Services.StudentServices;

import java.util.List;

@RestController
public class StudentController {

    private final StudentServices studentManger;

    @Autowired
    public StudentController(StudentServices student) {
        this.studentManger = student;
    }

    @GetMapping("/")
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/id/{id}")
    public List<Student> findStudentByID(@PathVariable int id){
        return studentManger.findAllById(id);
    }

    @GetMapping("/name/{name}")
    public List<Student> findStudentbuyname(@RequestParam String name){
        return studentManger.findAllByName(name);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentManger.save(student);
    }

    @GetMapping("/all")
    public List<Student> allStudent(){
        return studentManger.findAll();
    }
}
