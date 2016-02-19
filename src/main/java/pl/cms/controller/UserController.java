package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import pl.cms.dto.Converter;
import pl.cms.dto.UserDTO;
import pl.cms.model.UserBD;
import pl.cms.service.UserService;

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

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        
        UserBD userBd = new UserBD();
        Converter.convertUserDtoToUserBd.accept(userBd,userDTO);
        userService.saveUser(userBd);

        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.CREATED);

    }

}
