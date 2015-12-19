package pl.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.cms.model.Car;
import pl.cms.model.User;
import pl.cms.service.CarService;
import pl.cms.service.UserService;

/**
 * Created by Judytka on 2015-12-19.
 */
@Controller
public class TestController {


    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;


    @RequestMapping("/car")
    @ResponseBody
    public String CarMethod() {
        StringBuilder response = new StringBuilder();

        Car car = new Car();
        User user = new User("Konrad","Dawydiuk");
        userService.saveUser(user);

        car.setCarName("Moj samochod");
        car.setCarNumber(548556);
        car.setCarOwners(user);

        carService.saveCar(car);

        for(Car i: carService.findAllCar()) {
            response.append(i).append("<br>");
        }

        return response.toString();
    }
}