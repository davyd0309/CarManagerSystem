package pl.cms.controller;

import lombok.extern.java.Log;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
@Controller
@Log
public class LoginController {

    @RequestMapping(value = "/mainPage", method = RequestMethod.GET)
    public String loginUser(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        log.info(auth.getName());
        return "forward:/main.html";
    }


}
