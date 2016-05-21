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

    @RequestMapping(value = "{url}", method = RequestMethod.GET)
    public String changeContentIndex(@PathVariable String url){
        if (url.equals("info")) return "index/info";
        if (url.equals("loginUser")) return "index/loginUser";
        if (url.equals("addUser")) return "index/addUser";
        if (url.equals("addPlace")) return "index/addPlace";
        else {
            return "index";
        }
    }




}
