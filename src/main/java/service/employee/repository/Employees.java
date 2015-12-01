package service.employee.repository;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gmanpark on 2015-11-30.
 */
@Entity
@Table(name="employees")
public class Employees implements Serializable {
    @Id
    @Column(name = "emp_no", nullable = false)
    private int emp_no;
    @Column(name = "birth_date", nullable = false)
    private String birth_date;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "hire_date", nullable = false)
    private String hire_date;

    @OneToOne
    @JoinColumn(name="emp_no")
    private DepartmentEmployee departmentEmployee;

    public DepartmentEmployee getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="emp_no")})
    private List<Salaries> sararies = new ArrayList<Salaries>();

    public List<Salaries> getSararies() {
        return sararies;
    }

    public void setSararies(List<Salaries> sararies) {
        this.sararies = sararies;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    @Override
    public String toString() {
        return "Employees{}";
    }
}
