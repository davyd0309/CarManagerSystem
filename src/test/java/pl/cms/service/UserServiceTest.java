package pl.cms.service;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.cms.CarManagerSystemApplication;
import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Konrad on 2016-02-19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CarManagerSystemApplication.class)
@WebAppConfiguration
@Log
public class UserServiceTest {

@Autowired
private UserService userService;


    @Test
    public void getAllUser(){
        List all = userService.getAll();
        Assert.assertNotNull(all);
    }



}
