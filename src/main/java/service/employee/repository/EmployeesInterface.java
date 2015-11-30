package service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Cacheable;
import java.util.List;

/**
 * Created by gmanpark on 2015-11-30.
 */
@Cacheable
public interface EmployeesInterface extends JpaRepository<Employees, Integer>{
}
