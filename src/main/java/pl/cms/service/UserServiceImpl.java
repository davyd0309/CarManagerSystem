package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.UserDao;
import pl.cms.model.UserBD;

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
}
