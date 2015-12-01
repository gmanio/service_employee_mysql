package service.employee.repository;

import javax.persistence.*;

/**
 * Created by gmanpark on 2015-12-01.
 */
@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @Column(name = "dept_no", nullable = false)
    private String deptNo;

    @Column(name = "dept_name", unique = true, nullable = false)
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }
}
