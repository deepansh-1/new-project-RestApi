package com.example.Spring.Boot.Crud.Repository;

import com.example.Spring.Boot.Crud.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(value = "select * from shift where facility_id =(?1)",nativeQuery = true)
    List<Student> findAllById(Long id);
    @Query(value = "UPDATE shift SET Student_name =(?1)  WHERE facility_id = (?2)",nativeQuery = true)
    Student updateDataByUserInput(String name, Long userId);
    @Query(value = " delete from shift where facility_id =(?1)", nativeQuery = true)
    Student deleteByUserId(Long userId);
 @Query(value = "SELECT * from student INNER JOIN unit ON student.ID = class2.unit_id where id = (?1)",nativeQuery = true)
    List<Student> findAllByuserIdByUsingJoin(Long userId);
}
