package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.dto.InformationDTO;
import pl.cms.model.CarBD;
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
    public ResponseEntity<List<InformationDTO>> getInformationToTable() {
        List<InformationDTO> information = carService.getInformation();
        HttpStatus httpStatus = information != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<List<InformationDTO>>(information, httpStatus);
    }

    @RequestMapping(value = "addCar",method = RequestMethod.POST,produces = "application/json" )
    public ResponseEntity<CarBD> addAndSaveCar(@RequestBody CarBD car){
        carService.saveOrUpdate(car);
        HttpStatus httpStatus = car !=null ? HttpStatus.CREATED : HttpStatus.CONFLICT;
        return new ResponseEntity<CarBD>(car,httpStatus);
    }

    @RequestMapping(value = "carListForSelect", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<CarBD>> getCarListForSelect() {
        List<CarBD> carList = carService.getAll();
        HttpStatus httpStatus = carList != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<List<CarBD>>(carList, httpStatus);
    }
}
