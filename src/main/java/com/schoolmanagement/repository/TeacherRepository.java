package com.schoolmanagement.repository;

import com.schoolmanagement.entity.teacher.Teacher;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    @Query("SELECT t FROM Teacher t " +
            "WHERE LOWER(t.fullName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.gender) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.role) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.dept) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.qulification) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.number) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Teacher> serach(@Param("searchTerm") String searchTerm);

}
