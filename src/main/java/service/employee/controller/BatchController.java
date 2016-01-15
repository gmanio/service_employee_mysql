package service.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import service.employee.model.BatchModel;
import service.employee.repository.BatchRepository;

/**
 * Created by gmanpark on 2016-01-14.
 */
@RestController
public class BatchController {

    @Autowired
    private BatchRepository batchRepository;

    @Scheduled(cron="*/5 * * * * MON-FRI")
//    @RequestMapping(name = "/batch", method = RequestMethod.GET)
    public void tense(){
        BatchModel batchModel = new BatchModel();
        batchModel.setStr("test");

        batchRepository.save(batchModel);
    }
}
