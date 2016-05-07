package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.dto.InformationDTO;
import pl.cms.model.CarBD;
import pl.cms.model.CarBD;

import java.util.List;

/**
 * Created by Konrad on 2015-12-19.
 */

public interface CarService {

List<InformationDTO> getInformation();
void saveOrUpdate(CarBD car);
List<CarBD>getAll();
}
