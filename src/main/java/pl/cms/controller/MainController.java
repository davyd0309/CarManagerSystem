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

    @RequestMapping(value = "{userId}/{urlMain}", method = RequestMethod.GET)
    public ModelAndView changeContent(@PathVariable Integer userId,@PathVariable String urlMain){
        ModelAndView mav = new ModelAndView("main");
        if(Objects.equals(urlMain, "tabela")) mav.addObject("tamplateMain",1);
        return mav;
    }

}
