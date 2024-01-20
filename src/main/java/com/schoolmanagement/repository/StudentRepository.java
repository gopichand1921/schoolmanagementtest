package com.schoolmanagement.repository;

import com.schoolmanagement.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT s FROM Student s " +
            "WHERE lower(s.firstname) LIKE lower(concat('%', :name, '%')) " +
            "OR (CASE WHEN :name IS NOT NULL AND lower(cast(s.rollNumber as string)) LIKE lower(concat('%', :name, '%')) THEN true ELSE false END) " +
            "OR lower(s.lastName) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.phoneNumber) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.fatherName) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.motherName) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.grade) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.classofStudent) LIKE lower(concat('%', :name, '%')) " +
            "OR lower(s.address) LIKE lower(concat('%', :name, '%'))")
    List<Student> searchStudents(@Param("name") String name);


    void deleteByrollNumber(int id);

    Student findByrollNumber(int id);
}
