package com.schoolmanagement.entity.teacher;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Teacher {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private  int teacherId;
   private String fullName;
   private  String gender;
    private String role;
   private  String dept;
   private  String qulification;
   private String number;
   private  double salary;
   private float experience;
}
