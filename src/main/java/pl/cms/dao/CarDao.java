package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cms.dto.InformationDTO;
import pl.cms.model.CarBD;
import pl.cms.model.CarBD;

import java.util.List;

/**
 * Created by Konrad on 2015-12-19.
 */

public interface CarDao extends GenericDao{

List<InformationDTO> getInformationAboutExchange();
    List<InformationDTO> getInformationAboutRefueling();
CarBD getById(Integer id);
}
