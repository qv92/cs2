package qlnv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qlnv.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
