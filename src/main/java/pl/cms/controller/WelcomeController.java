package pl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Konrad on 2016-01-23.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "forward:/index.html";
    }

}
