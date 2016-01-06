package pl.cms.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.cms.dao.*;
import pl.cms.model.CarBD;
import pl.cms.model.ExchangeBD;
import pl.cms.model.PlaceBD;
import pl.cms.model.UserBD;
import pl.cms.service.CarService;
import pl.cms.service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Konrad on 2015-12-19.
 */
@Controller
public class TestController {

    private static Logger log = Logger.getLogger(TestController.class);

    @Autowired
    private CarDao carDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ExchangeDao exchangeDao;

    @Autowired
    private RefuelingDao refuelingDao;

    @Autowired
    private PlaceDao placeDao;


    @RequestMapping("/car")
    @ResponseBody
    public String CarMethod() {
        StringBuilder response = new StringBuilder();

        UserBD konrad = new UserBD("Konrad","Dawydiuk");
        UserBD judyta = new UserBD("Judyta","Dawydiuk");
        UserBD michal = new UserBD("Michal","Pawlowski");
        UserBD marek = new UserBD("Marek","Kawalik");
        UserBD slawek = new UserBD("Slawek","Polak");
        userDao.save(konrad);
        userDao.save(judyta);
        userDao.save(marek);
        userDao.save(michal);
        userDao.save(slawek);


        CarBD opel = new CarBD();
        opel.setCarName("Opel Corsa");
        opel.setCarNumber("LKS4548");
        opel.getCarOwnersList().add(userDao.findOne(2));
        opel.getCarOwnersList().add(userDao.findOne(3));
        carDao.save(opel);

        CarBD seat = new CarBD();
        seat.setCarName("Seat Ibiza");
        seat.setCarNumber("LCH4457");
         seat.getCarOwnersList().add(userDao.findOne(1));
        seat.getCarOwnersList().add(userDao.findOne(2));
        carDao.save(seat);


        CarBD mazda = new CarBD();
        mazda.setCarName("Mazda");
        mazda.setCarNumber("LU23321");
        mazda.getCarOwnersList().add(userDao.findOne(4));
        mazda.getCarOwnersList().add(userDao.findOne(5));
        carDao.save(mazda);

        CarBD mazda1 = new CarBD();
        mazda1.setCarName("Ferari");
        mazda1.setCarNumber("LKS77777");
        mazda1.getCarOwnersList().add(userDao.findOne(1));
        mazda1.getCarOwnersList().add(userDao.findOne(2));
        mazda1.getCarOwnersList().add(userDao.findOne(3));
        mazda1.getCarOwnersList().add(userDao.findOne(4));
        mazda1.getCarOwnersList().add(userDao.findOne(5));

        carDao.save(mazda1);

        Iterable<CarBD> cars = carDao.findAll();
        cars.forEach(car->System.out.println(car.getId() +" "+ car.getCarName() +" "+ car.getCarOwnersList().size()));





        ExchangeBD wymianaOpel1 = new ExchangeBD();
        wymianaOpel1.setCarBDId(carDao.findOne(2));
        wymianaOpel1.setExchangeDate(new Date());
        wymianaOpel1.setExchangeDescription("Opis wymiana opla 1");

        exchangeDao.save(wymianaOpel1);



        ExchangeBD wymianaOpel2 = new ExchangeBD();
        wymianaOpel2.setCarBDId(carDao.findOne(3));
        wymianaOpel2.setExchangeDate(new Date());
        wymianaOpel2.setExchangeDescription("Opis wymiana opla 2");

        exchangeDao.save(wymianaOpel2);


        ExchangeBD wymianaOpel3= new ExchangeBD();
        wymianaOpel3.setCarBDId(carDao.findOne(2));
        wymianaOpel3.setExchangeDate(new Date());
        wymianaOpel3.setExchangeDescription("Opis wymiana opla 3");

        exchangeDao.save(wymianaOpel3);


        ExchangeBD wymianaSeat1 = new ExchangeBD();
        wymianaSeat1.setCarBDId(carDao.findOne(5));
        wymianaSeat1.setExchangeDate(new Date());
        wymianaSeat1.setExchangeDescription("Opis wymiana seat 1");

        exchangeDao.save(wymianaSeat1);


        ExchangeBD wymianaSeat2 = new ExchangeBD();
        wymianaSeat2.setCarBDId(carDao.findOne(1));
        wymianaSeat2.setExchangeDate(new Date());
        wymianaSeat2.setExchangeDescription("Opis wymiana seat 2");

        exchangeDao.save(wymianaSeat2);

        PlaceBD miejsce1 = new PlaceBD();
        miejsce1.setName("miejsce 1");
        miejsce1.setAddress("Krasnsyatw 22-254");
        placeDao.save(miejsce1);

        PlaceBD miejsce2 = new PlaceBD();
        miejsce2.setName("miejsce 2");
        miejsce2.setAddress("Chełm 22-254");
        placeDao.save(miejsce2);


wymianaOpel1.setExchangePlace(miejsce1);
exchangeDao.save(wymianaOpel1);

wymianaSeat1.setExchangePlace(miejsce2);
        exchangeDao.save(wymianaSeat1);




        return "forward:/index.html";
    }
}
