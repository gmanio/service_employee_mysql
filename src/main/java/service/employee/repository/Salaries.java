package service.employee.repository; /**
 * Created by gmanpark on 2015-11-30.
 */

import javax.persistence.*;

@Entity
@Table(name="salaries")
public class Salaries {
    @Id
    @Column(name = "emp_no", nullable = false)
    private int emp_no;
    @Column(name = "salary", nullable = false)
    private String salary;

    @Column(name = "from_date", nullable = false)
    private String from_date;

    @Column(name = "to_date", nullable = false)
    private String to_date;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }
}