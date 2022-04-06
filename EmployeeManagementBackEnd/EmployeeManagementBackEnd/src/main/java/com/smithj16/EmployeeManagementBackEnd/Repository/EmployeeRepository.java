package com.smithj16.EmployeeManagementBackEnd.Repository;

import com.smithj16.EmployeeManagementBackEnd.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
