package pl.cms.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.cms.dao.CarDao;
import pl.cms.dao.ExchangeDao;
import pl.cms.dao.RefuelingDao;
import pl.cms.dao.UserDao;
import pl.cms.model.CarBD;
import pl.cms.model.ExchangeBD;
import pl.cms.model.UserBD;
import pl.cms.service.CarService;
import pl.cms.service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Judytka on 2015-12-19.
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


    @RequestMapping("/car")
    @ResponseBody
    public String CarMethod() {
        StringBuilder response = new StringBuilder();

//        UserBD konrad = new UserBD("Konrad","Dawydiuk");
//        UserBD judyta = new UserBD("Judyta","Dawydiuk");
//
//        userService.saveUser(konrad);
//        userService.saveUser(judyta);
//
//
//        CarBD opel = new CarBD();
//        opel.setCarName("Opel Corsa");
//        opel.setCarNumber(458442);
//        List<UserBD> opelList = new ArrayList<>();
//        opelList.add(konrad);
//        opel.setCarOwnerslist(opelList);
//        carService.saveCar(opel);

        CarBD seat = new CarBD();
        seat.setCarName("Seat Ibiza");
        seat.setCarNumber(1322210);
        List<UserBD> seatList = new ArrayList<>();
        seatList.add(userDao.findOne(1));
        seatList.add(userDao.findOne(2));
        seat.setCarOwnerslist(seatList);
        carDao.save(seat);

//        for (int i = 0; i < opel.getCarOwnerslist().size(); i++) {
//            log.info("OPEL" + "---"+opel.getCarOwnerslist().get(i).getFirstName());
//        }

//        for (int i = 0; i < seat.getCarOwnerslist().size(); i++) {
//            log.info("SEAT" + "---"+seat.getCarOwnerslist().get(i).getFirstName());
//        }

//        ExchangeBD wymianaOpel1 = new ExchangeBD();
//        wymianaOpel1.setCarBDId(opel);
//        wymianaOpel1.setExchangeDate(new Date());
//        wymianaOpel1.setExchangeDescription("Opis wymiana opla 1");
//        opel.getExchangeBDList().add(wymianaOpel1);
//        exchangeDao.save(wymianaOpel1);
//        carService.saveCar(opel);
//
//
//        ExchangeBD wymianaOpel2 = new ExchangeBD();
//        wymianaOpel1.setCarBDId(opel);
//        wymianaOpel1.setExchangeDate(new Date());
//        wymianaOpel1.setExchangeDescription("Opis wymiana opla 2");
//        opel.getExchangeBDList().add(wymianaOpel2);
//        exchangeDao.save(wymianaOpel2);
//        carService.saveCar(opel);
//
//        ExchangeBD wymianaOpel3= new ExchangeBD();
//        wymianaOpel1.setCarBDId(opel);
//        wymianaOpel1.setExchangeDate(new Date());
//        wymianaOpel1.setExchangeDescription("Opis wymiana opla 3");
//        opel.getExchangeBDList().add(wymianaOpel3);
//        exchangeDao.save(wymianaOpel3);
//        carService.saveCar(opel);
//
//        ExchangeBD wymianaSeat1 = new ExchangeBD();
//        wymianaOpel1.setCarBDId(seat);
//        wymianaOpel1.setExchangeDate(new Date());
//        wymianaOpel1.setExchangeDescription("Opis wymiana seat 1");
//        seat.getExchangeBDList().add(wymianaSeat1);
//        exchangeDao.save(wymianaSeat1);
//        carService.saveCar(seat);
//
//        ExchangeBD wymianaSeat2 = new ExchangeBD();
//        wymianaOpel1.setCarBDId(seat);
//        wymianaOpel1.setExchangeDate(new Date());
//        wymianaOpel1.setExchangeDescription("Opis wymiana seat 2");
//        seat.getExchangeBDList().add(wymianaSeat2);
//        exchangeDao.save(wymianaSeat2);
//        carService.saveCar(seat);






//        for(CarBD i: carService.findAllCar()) {
//            response.append(i).append("<br>");
//        }

        return response.toString();
    }
}
