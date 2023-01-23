package com.example.Spring.Boot.Crud.Service;

import com.example.Spring.Boot.Crud.Model.Student;
import com.example.Spring.Boot.Crud.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {

 @Autowired
 public StudentRepository studentRepository;
 public List<Student> getAllSubject(@PathVariable Long id){
     List<Student> st = studentRepository.findAllById(id);
     return st;
 }

public  void updateTable(String name , @PathVariable Long userId){
     Student st = studentRepository.updateDataByUserInput(name , userId);
}

public  void deleteTable(Long userId){
      Student st = studentRepository.deleteByUserId(userId);
}
public List<Student> joinTable(@PathVariable Long userId){
     List<Student> st = studentRepository.findAllByuserIdByUsingJoin(userId);
     return  st;
}
}
