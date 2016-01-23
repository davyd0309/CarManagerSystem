package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.cms.dto.UserDTO;
import pl.cms.model.UserBD;
import pl.cms.service.UserService;

/**
 * Created by Konrad on 2016-01-23.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public UserDTO saveUser(@RequestBody UserDTO userDto){
        UserBD userBd = new UserBD();
        userBd.setFirstName(userDto.getFirstName());
        userBd.setLastName(userDto.getLastName());
        userService.saveUser(userBd);
        return userDto;
    }

}
