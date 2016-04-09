package pl.cms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */
public abstract class AbstractDao {

    @Autowired
    SessionFactory sessionFactory;


    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
