package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.model.RefuelingBD;
import pl.cms.service.RefuelingService;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@RestController
@RequestMapping("refueling")
public class RefuelingController {

    private RefuelingService refuelingService;

    @Autowired
    public RefuelingController(RefuelingService refuelingService) {
        this.refuelingService = refuelingService;
    }

    @RequestMapping(value = "addRefueling",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<RefuelingBD> addRefueling(@RequestBody RefuelingBD refueling){
        refuelingService.saveOrUpdate(refueling);
        HttpStatus httpStatus = refueling !=null ? HttpStatus.CREATED : HttpStatus.CONFLICT;
        return new ResponseEntity<RefuelingBD>(refueling,httpStatus);
    }
}
