package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.dto.InformationDTO;
import pl.cms.service.CarService;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 23.04.2016.
 */
@RestController
@RequestMapping("car")
public class CarController {

private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService=carService;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<InformationDTO>> getOneUserById() {
        List<InformationDTO> information = carService.getInformation();
        HttpStatus httpStatus = information != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<List<InformationDTO>>(information, httpStatus);
    }

}
