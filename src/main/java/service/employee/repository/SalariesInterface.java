package service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gmanpark on 2015-12-08.
 */
public interface SalariesInterface extends JpaRepository<Salaries, Salaries.SalariesCompositeId> {}
