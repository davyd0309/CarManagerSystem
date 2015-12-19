package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cms.model.Car;

/**
 * Created by Judytka on 2015-12-19.
 */

public interface CarDao extends CrudRepository<Car,Integer>{
}
