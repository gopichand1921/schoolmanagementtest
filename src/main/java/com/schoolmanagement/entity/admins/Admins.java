package com.schoolmanagement.entity.admins;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "admins")
public class Admins {
    @jakarta.persistence.Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
            @Column(name = "teacher_ID")
    int Id;
    String Fullname;
    String role;
    String  username;
    String password;

}
