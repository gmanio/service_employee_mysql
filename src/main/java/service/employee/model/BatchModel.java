package service.employee.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by gmanpark on 2016-01-14.
 */
@Entity
@Table(name = "tb_batch")
@Data
@Getter
@Setter
public class BatchModel {
    @Id
    @Column(name = "idx")
    private int idx;
    @Column(name = "str")
    private String str;


}
