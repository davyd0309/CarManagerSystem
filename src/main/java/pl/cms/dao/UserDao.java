package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import pl.cms.model.Car;
import pl.cms.model.User;

/**
 * Created by Judytka on 2015-12-19.
 */

public interface UserDao extends CrudRepository<User,Integer>{

}
