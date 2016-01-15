package service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service.employee.model.BatchModel;

/**
 * Created by gmanpark on 2016-01-14.
 */
public interface BatchRepository extends JpaRepository<BatchModel, Long> {
}
