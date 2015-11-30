package service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by gmanpark on 2015-11-30.
 */
public interface EmployeesInterface extends JpaRepository<Employees, Integer>{
    List<Employees> findByGender(String gender);
    List<Employees> findByFirstName(String name);

    List<Employees> findByLastName(String lastname);
}
