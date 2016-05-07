package pl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */
@Controller
@RequestMapping(value = "main")
public class MainController {


    @RequestMapping(value = "{url}", method = RequestMethod.GET)
    public String changeContentMain(@PathVariable String url) {
//    if (url.equals("addCar")) return "main/dialog/addCar";
//    else {
//        return "main";
//    }
//}
        return null;
    }



}