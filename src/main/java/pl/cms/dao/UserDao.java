package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Judytka on 2015-12-19.
 */

public interface UserDao {

List getAll();

}
