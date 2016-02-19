package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.UserDao;
import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Konrad on 2015-12-19.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public UserBD saveUser(UserBD user) {
        userDao.save(user);
        return user;
    }

    @Override
    public UserBD findUserById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public UserBD findUserByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    public List<UserBD> getAllUser() {
        return (List<UserBD>) userDao.findAll();
    }
}
