package pl.cms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */

@Repository
public abstract class GenericDaoImpl <E, PK extends java.io.Serializable> implements GenericDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<E> entityClass;

    public GenericDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void saveOrUpdate(Object object) {

    }

    @Override
    public List findAll() {
        return getSession().createCriteria(entityClass).list();
    }

    @Override
    public E findOne(Serializable id) {
        return (E) getSession().createCriteria(entityClass).add(Restrictions.eq("id",id));
    }
}
