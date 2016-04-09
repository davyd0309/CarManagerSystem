package pl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "{url}", method = RequestMethod.GET)
    public ModelAndView changeContent(@PathVariable String url){
        ModelAndView mav = new ModelAndView("index");
        if(Objects.equals(url, "logowanie")) mav.addObject("tamplateIndex",1);
        if(Objects.equals(url, "dodajUzytkownika")) mav.addObject("tamplateIndex",2);
        if(Objects.equals(url, "informacje")) mav.addObject("tamplateIndex",3);

        return mav;
    }


}
