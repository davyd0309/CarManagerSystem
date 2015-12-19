package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.model.Car;

import java.util.List;

/**
 * Created by Judytka on 2015-12-19.
 */
@Service
@Transactional
public class CarService {

    @Autowired
    private CarDao carDao;

    public CarService() {
    }

    public void saveCar(Car car){
        carDao.save(car);
    }

    public Iterable<Car> findAllCar(){
        return carDao.findAll();
    }
}
