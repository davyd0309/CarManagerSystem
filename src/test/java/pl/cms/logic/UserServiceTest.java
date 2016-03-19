package pl.cms.logic;

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
import pl.cms.service.UserService;

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
public void creauteUser(){
    UserBD user = new UserBD();
    user.setFirstName("User1Imie");
    user.setLastName("User1Nazwisko");
    user.setLogin("User1Login");
    userService.saveUser(user);
}
    @Test
    public void findUserById(){
        UserBD userById = userService.findUserById(7);
        Assert.assertNotNull(userById);

    }


}
