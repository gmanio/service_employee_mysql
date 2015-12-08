package service.employee.repository; /**
 * Created by gmanpark on 2015-11-30.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="salaries")
@IdClass(SalariesCompositeId.class)
public class Salaries {
    @Id
    @Column(name = "emp_no", insertable = false, updatable = false)
    private int empNo;

    @Column(name = "salary", nullable = false)
    private String salary;

    @Id
    @Column(name = "from_date", insertable = false, updatable = false)
    private Date fromDate;

    @Column(name = "to_date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}

@IdClass(SalariesCompositeId.class)
class SalariesCompositeId implements Serializable {
    private int empNo;
    private Date fromDate;

    public SalariesCompositeId() {

    }

    public SalariesCompositeId(int empNo, Date fromDate) {
        this.empNo = empNo;
        this.fromDate = fromDate;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof SalariesCompositeId) &&
        empNo == ((SalariesCompositeId)o).getEmpNo() &&
                fromDate == ((SalariesCompositeId)o).getFromDate());
    }

    @Override
    public int hashCode() {
        int result = getEmpNo();
        result = 31 * result + getFromDate().hashCode();
        return result;
    }
}