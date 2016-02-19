package pl.cms.service;

import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Judytka on 2016-01-23.
 */
public interface UserService  {

    UserBD saveUser(UserBD user);
    UserBD findUserById(Integer id);
    UserBD findUserByLogin(String login);
    List<UserBD> getAllUser();
}
