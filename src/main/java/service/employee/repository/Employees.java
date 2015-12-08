package service.employee.repository;

import javafx.scene.input.DataFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gmanpark on 2015-11-30.
 */
@Entity
@Table(name="employees")
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

    public DepartmentEmployee getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(DepartmentEmployee departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    @OneToMany(mappedBy = "empNo")
    private List<Salaries> sararies;

    public List<Salaries> getSararies() {
        return sararies;
    }

    public void setSararies(List<Salaries> sararies) {
        this.sararies = sararies;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getBirthDate() {
        return this.format.format(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHireDate() {
        return this.format.format(hireDate);
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
