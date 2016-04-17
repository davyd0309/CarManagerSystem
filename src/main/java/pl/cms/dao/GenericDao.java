package pl.cms.dao;

import java.util.List;

/**
 * Created by Konrad on 17.04.2016.
 */
public interface GenericDao <E, PK extends java.io.Serializable>{

    void saveOrUpdate(E object);

    void delete(E object);

    List<E> findAll();


}
