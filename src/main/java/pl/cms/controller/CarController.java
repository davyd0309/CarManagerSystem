package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "listExchange", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<InformationDTO>> getInformationToTable() {
        List<InformationDTO> information = carService.getInformationAboutExchange();
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

    @RequestMapping(value = "getOneCar/{id}", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<CarBD> getOneCarById(@PathVariable Integer id) {
        CarBD car = carService.getById(id);
        HttpStatus httpStatus = car != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<CarBD>(car, httpStatus);
    }
}
