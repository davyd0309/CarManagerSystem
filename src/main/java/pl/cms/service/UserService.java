package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.UserDao;
import pl.cms.model.UserBD;

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

    public void saveUser(UserBD userBD){
        userDao.save(userBD);
    }
}
