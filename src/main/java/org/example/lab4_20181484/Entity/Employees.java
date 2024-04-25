package org.example.lab4_20181484.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//si es autoincremental
    @Column(name ="employee_id", nullable = false)//para mapear
    private Integer employee_id;

    @Column(name ="first_name", length = 45)//para mapear
    private String firstname;

    @Column(name ="last_name", nullable = false, length = 45)//para mapear
    private String last_name;

    @Column(name ="email", nullable = false, length = 45)//para mapear
    private String email;

    @Column(name ="password", length = 45)//para mapear
    private String password;

    @Column(name ="phone_number", length = 45)//para mapear
    private String phone_number;

    @Column(name ="hire_date", nullable = false)//para mapear
    private Date hire_date;


}
