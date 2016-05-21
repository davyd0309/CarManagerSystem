package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import pl.cms.model.PlaceBD;
import pl.cms.model.UserBD;
import pl.cms.service.PlaceService;
import pl.cms.service.UserService;

import java.net.URI;
import java.util.List;

/**
 * Created by Konrad on 2016-01-23.
 */

@RestController
@RequestMapping("/place")
public class PlaceController {


    private PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }


    @RequestMapping(value = "/allPlace", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<PlaceBD>> getAllPlace() {
        List all = placeService.getAll();
        HttpStatus httpStatus = all.size()!= 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<List<PlaceBD>>(all, httpStatus);
    }

    @RequestMapping(value = "/savePlace",method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<PlaceBD> savePlace(@RequestBody PlaceBD place){
        PlaceBD placeBD = placeService.saveOrUpdate(place);
        HttpStatus httpStatus = place.getId()!=null ? HttpStatus.CREATED : HttpStatus.NOT_FOUND;
        return new ResponseEntity<PlaceBD>(placeBD, httpStatus);
    }



}
