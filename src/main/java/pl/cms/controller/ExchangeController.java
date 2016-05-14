package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.model.ExchangeBD;
import pl.cms.model.RefuelingBD;
import pl.cms.service.ExchangeService;
import pl.cms.service.RefuelingService;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@RestController
@RequestMapping("exchange")
public class ExchangeController {

    private ExchangeService exchangeService;

    @Autowired
    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @RequestMapping(value = "addExchange",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<ExchangeBD> addExchange(@RequestBody ExchangeBD exchange){
        exchangeService.saveOrUpdate(exchange);
        HttpStatus httpStatus = exchange !=null ? HttpStatus.CREATED : HttpStatus.CONFLICT;
        return new ResponseEntity<ExchangeBD>(exchange,httpStatus);
    }
}
