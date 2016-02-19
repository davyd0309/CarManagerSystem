package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import pl.cms.model.UserBD;

/**
 * Created by Judytka on 2015-12-19.
 */

public interface UserDao extends CrudRepository<UserBD,Integer>{

    UserBD findByLogin(String login);

}
