package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.CarDao;
import pl.cms.dao.UserDao;
import pl.cms.model.Car;
import pl.cms.model.User;

/**
 * Created by Judytka on 2015-12-19.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserService() {
    }

    public void saveUser(User user){
        userDao.save(user);
    }
}
