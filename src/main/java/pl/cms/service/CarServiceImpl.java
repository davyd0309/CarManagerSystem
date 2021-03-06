package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.dto.InformationDTO;
import pl.cms.model.CarBD;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 23.04.2016.
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {


    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<InformationDTO> getInformationAboutExchange() {
        return carDao.getInformationAboutExchange();
    }

    @Override
    public void saveOrUpdate(CarBD car) {
        carDao.saveOrUpdate(car);
    }

    @Override
    public List<CarBD> getAll() {
        List all = carDao.findAll();
        return all;
    }

    @Override
    public CarBD getById(Integer id) {
        return  carDao.getById(id);
    }


}
