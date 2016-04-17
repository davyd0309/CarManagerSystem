package pl.cms.dao;

import org.springframework.stereotype.Repository;
import pl.cms.model.UserBD;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */
@Repository
public class UserDaoImplHibImpl extends GenericDaoImpl<UserBD,Integer> implements UserDao{

    public UserDaoImplHibImpl() {
        super(UserBD.class);
    }
}
