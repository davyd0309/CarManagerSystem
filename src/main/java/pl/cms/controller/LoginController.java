package pl.cms.controller;

import lombok.extern.java.Log;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.cms.dto.UserDTO;

/**
 * Created by Judytka on 2016-02-19.
 */
@RestController
@Log
public class LoginController {

    @RequestMapping(value = "/loginUser", method = RequestMethod.GET)
    public User loginUser() {
        User activeUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return activeUser;
    }


}
