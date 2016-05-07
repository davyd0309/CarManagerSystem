package pl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@Controller
@RequestMapping("dialog")
public class DialogController {

    @RequestMapping(value = "{url}", method = RequestMethod.GET)
    public String changeContentIndex(@PathVariable String url){
        if (url.equals("addCarDialog")) return "main/dialog/addCarDialog";
        if (url.equals("addRefuelingDialog")) return "main/dialog/addRefuelingDialog";
        else {
            return null;
        }
    }
}
