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
@RequestMapping(value = "index")
public class IndexController {

    @RequestMapping(value = "{urlIndex}", method = RequestMethod.GET)
    public String changeContent(@PathVariable String urlIndex){
        ModelAndView mav = new ModelAndView("index");
        if(Objects.equals(urlIndex, "logowanie")) mav.addObject("tamplateIndex",1);
        if(Objects.equals(urlIndex, "dodajUzytkownika")) mav.addObject("tamplateIndex",2);
        if(Objects.equals(urlIndex, "informacje")) mav.addObject("tamplateIndex",3);

        return "redirect:/index";
    }


}
