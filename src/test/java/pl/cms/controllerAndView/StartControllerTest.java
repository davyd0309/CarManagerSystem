package pl.cms.controllerAndView;

import org.junit.Test;

import org.springframework.test.web.servlet.MockMvc;
import pl.cms.controller.StartController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


/**
 * Created by Konrad on 19.03.2016.
 */

public class StartControllerTest {



public void indexTestPage()throws Exception{
   StartController controller = new StartController();
    MockMvc mockMvc = standaloneSetup(controller).build();
    mockMvc.perform(get("/index")).andExpect(view().name("index"));
}




}
