package org.example.lab4_20181484.Repository;

import org.example.lab4_20181484.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employees, Integer> {
}
