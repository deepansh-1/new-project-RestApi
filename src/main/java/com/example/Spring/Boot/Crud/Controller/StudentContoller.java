package com.example.Spring.Boot.Crud.Controller;

import com.example.Spring.Boot.Crud.Model.Student;
import com.example.Spring.Boot.Crud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentContoller {
    private StudentService ss;
    @RequestMapping("/subjects")
    @GetMapping("/allsubject")
   public List<Student> getAllSubject(Long id)
{
  List<Student> response = ss.getAllSubject(id);
     return response;
}
   @PutMapping("/update")
    public void updateTable(String name , @PathVariable Long userId){
        ss.updateTable(name ,userId);
}
    @PutMapping("/delete")
    public void deleteTable(Long userId){
        ss.deleteTable(userId);
    }
    @GetMapping("/joinTable")
   public  List<Student> joinTable(@PathVariable Long userId){
       List<Student> response = ss.joinTable(userId);
        return  response;
    }

}
