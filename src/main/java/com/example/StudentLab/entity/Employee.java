package com.example.StudentLab.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @NotBlank(message = "FirstName is mandatory")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "LastName is mandatory")
    @Length(min = 1,max = 15,message = "less than 15 and greater than one")
    @Column(name = "last_name")
    private String lastName;

    @Email(message = "Please Input Email")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Phone is mandatory")
    @Length(min = 9,max = 10,message = "phone min 9 and max 10")
    @Column(name = "phone")
    private String phone;


}
