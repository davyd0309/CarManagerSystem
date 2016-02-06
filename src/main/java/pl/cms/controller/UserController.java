package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public void saveUser(@RequestParam String firstName,
                         @RequestParam String lastName){
        UserBD userBd = new UserBD();
        userBd.setFirstName(firstName);
        userBd.setLastName(lastName);
        userService.saveUser(userBd);

    }

}
