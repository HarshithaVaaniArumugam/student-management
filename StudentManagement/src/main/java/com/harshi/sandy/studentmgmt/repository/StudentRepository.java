package com.harshi.sandy.studentmgmt.repository;

import com.harshi.sandy.studentmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAll();

    default Optional<Student> findById(Integer id) {
        return null;
    }

}
