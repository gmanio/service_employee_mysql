package service.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.employee.eight.ListFilter;

/**
 * Created by gmanpark on 2015-12-03.
 */
@Controller
public class ServiceController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getName(){
        logger.info("test index");
        return "index";
    }


    @Autowired
    private ListFilter listFilter;

    @RequestMapping(value="/lst", method = RequestMethod.GET)
    public String execute(){
        logger.info("lst");
        listFilter.streamFilter();
        return "index";
    }
}
