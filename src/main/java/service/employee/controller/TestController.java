package service.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import service.employee.repository.Employees;
import service.employee.repository.EmployeesInterface;
import service.employee.repository.Salaries;
import service.employee.repository.SalariesInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmanpark on 2015-11-30.
 */
@RestController
public class TestController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    EmployeesInterface employeesInterface;

    @Autowired
    SalariesInterface salariesInterface;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    @Cacheable(cacheNames = "employee")
    public Employees get(@RequestParam(value = "id") int Id) {

//        int tableSize = employeesInterface.findAll().size();

//        logger.info("Size of Table is :: " + String.valueOf(tableSize));

        Employees emp = employeesInterface.findOne(Id);

//        for (Salaries salary : emp.getSararies()) {
//            salary.setSalary("1111111");
//            salariesInterface.save(salary);
//        }

        return emp;
    }

    @RequestMapping(value = "/getGender", method = RequestMethod.GET)
    @ResponseBody
    public List<Employees> getGender(@RequestParam(value = "gender") String gender){
        return employeesInterface.findByGender(gender);
    }


    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    @ResponseBody
    public List<Employees> getName(@RequestParam(value = "name") String lastname){
        return employeesInterface.findByLastName(lastname);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    @Cacheable(cacheNames = "employees")
    public List<Employees> getAll() {
        List<Employees> empList = employeesInterface.findAll();
        List<Employees> emptyList = new ArrayList<>();

        for (int i = 1000; i < 1050; i++) {
            emptyList.add(empList.get(i));
        }

        return emptyList;
    }

    @RequestMapping(value = "/getFromTo", method = RequestMethod.GET)
    @ResponseBody
    @Cacheable(cacheNames = "employees")
    public List<Employees> getAll(@RequestParam(value = "start") int Start, @RequestParam(value = "end") int End) {
        List<Employees> empList = employeesInterface.findAll();
        List<Employees> emptyList = new ArrayList<>();

        for (int i = Start; i < End; i++) {
            emptyList.add(empList.get(i));
        }

        return emptyList;
    }
}
