package service.employee.repository;

import org.hibernate.annotations.Formula;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gmanpark on 2015-12-01.
 */
@Entity
@Table(name="dept_emp")
public class DepartmentEmployee{
    @Id
    @Column(name = "emp_no", nullable = true)
    private int empNo;

    @Column(name = "dept_no", nullable = true, insertable = false, updatable = false)
    private String deptNo;

    @OneToOne
    @JoinColumn(name="dept_no", referencedColumnName = "dept_no")
    private Departments departments;

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

}
