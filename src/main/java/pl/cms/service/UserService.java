package pl.cms.service;

import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Konrad on 2016-01-23.
 */
public interface UserService  {


    List getAll();
    UserBD findOne(Integer id);
    UserBD saveOrUpdate(UserBD user);

}
