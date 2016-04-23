package pl.cms.controller;

import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import pl.cms.model.UserBD;
import pl.cms.service.UserService;

import java.net.URI;
import java.util.List;

/**
 * Created by Konrad on 2016-01-23.
 */

@RestController
@RequestMapping("/user")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<UserBD> getOneUserById(@PathVariable Integer id) {
        UserBD user = userService.findOne(id);
        HttpStatus httpStatus = user != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<UserBD>(user, httpStatus);
    }

    @RequestMapping(value = "/allUser", method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<List<UserBD>> getAllUser() {
        List all = userService.getAll();
        HttpStatus httpStatus = all.size()!= 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<List<UserBD>>(all, httpStatus);
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<UserBD> saveUser(@RequestBody UserBD user,UriComponentsBuilder builder){
        UserBD userBD = userService.saveOrUpdate(user);
        HttpHeaders headers = new HttpHeaders();
        URI locationUri = builder.path("/user").path(String.valueOf(userBD.getId())).build().toUri();
        headers.setLocation(locationUri);
        HttpStatus httpStatus = userBD.getId()!=null ? HttpStatus.CREATED : HttpStatus.NOT_FOUND;
        return new ResponseEntity<UserBD>(userBD, headers, httpStatus);
    }



}
