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


    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List getAll() {
        return userDao.findAll();
    }

    @Override
    public UserBD findOne(Integer id) {
        return (UserBD)userDao.findOne(id);
    }

    @Override
    public UserBD saveOrUpdate(UserBD user) {
        userDao.saveOrUpdate(user);
       return user;
    }


}
