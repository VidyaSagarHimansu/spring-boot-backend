package org.testspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testspring.Model.Student;
import org.testspring.Repository.StudentRepository;

import java.util.Collections;
import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository studentManager;

    public List<Student> findAll(){
        return studentManager.findAll();
    }

    public List<Student> findAllById(Integer id) {
        return studentManager.findAllById(Collections.singleton(id));
    }

    public void save(Student student) {
        studentManager.save(student);
    }

    public List<Student> findAllByName(String name) {
        return studentManager.findAllByName(name);
    }
}
