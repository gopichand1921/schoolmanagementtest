package com.schoolmanagement.entity.student;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "student_details")
public class Student {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int rollNumber;
   private  String firstname;
   private String lastName;
   private String gander;
   private String phoneNumber;
  private  String fatherName;
  private String motherName;
   private String grade;
   private  String classofStudent;
   private String  address;



}
