package service.employee.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by gmanpark on 2015-11-30.
 */
@Entity
@Table(name="employees")
@Getter
@Setter
public class Employees{
    private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    @Id
    @Column(name = "emp_no", nullable = false)
    private int empNo;
    @Column(name = "birth_date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "hire_date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;

    @OneToOne
    @JoinColumn(name="empNo")
    private DepartmentEmployee departmentEmployee;

    public Departments getDepartmentEmployee() {
        return departmentEmployee.getDepartments();
    }

    public void setDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    @OneToMany(mappedBy = "empNo")
    private List<Salaries> sararies;
}
