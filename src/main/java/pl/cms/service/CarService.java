package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.model.CarBD;
import pl.cms.model.CarBD;

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

    public void saveCar(CarBD carBD){
        carDao.save(carBD);
    }

    public Iterable<CarBD> findAllCar(){
        return carDao.findAll();
    }
}
