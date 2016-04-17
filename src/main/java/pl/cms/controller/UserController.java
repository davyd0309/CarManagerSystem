package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.cms.model.UserBD;
import pl.cms.service.UserService;

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

}
