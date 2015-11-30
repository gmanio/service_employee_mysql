package service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gmanpark on 2015-11-30.
 */
public interface EmployeesInterface extends JpaRepository<Employees, Integer>{}
