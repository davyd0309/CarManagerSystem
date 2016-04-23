package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.dto.InformationDTO;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 23.04.2016.
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;


    @Override
    public List<InformationDTO> getInformation() {
        return carDao.getInformation();
    }
}
