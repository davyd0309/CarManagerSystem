package pl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Konrad on 19.03.2016.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }


    @RequestMapping(value = "/tamplate", method = RequestMethod.GET)
    public String tamplatePage() {
        return "tamplate";
    }

    @RequestMapping(value = "main/{userId}", method = RequestMethod.GET)
    public String mainPage(@PathVariable Integer userId) {
        return "main";
    }

}
