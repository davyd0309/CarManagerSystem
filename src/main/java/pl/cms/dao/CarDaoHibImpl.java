package pl.cms.dao;

import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import org.thymeleaf.expression.Lists;
import pl.cms.dto.InformationDTO;
import pl.cms.model.CarBD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konrad on 17.04.2016.
 */
@Repository
public class CarDaoHibImpl extends GenericDaoImpl<CarBD, Integer> implements CarDao {

    public CarDaoHibImpl() {
        super(CarBD.class);
    }

    @Override
    public List<InformationDTO> getInformationAboutExchange() {
        return getSession().createSQLQuery("SELECT " +
                "s.nazwa_samochodu as carName," +
                "w.data_wymiany as dateInfo," +
                "w.opis_wymiany as exchange," +
                "w.oplata_za_wymiane as price " +
                "FROM samochody s\n" +
                "INNER JOIN wymiany w ON s.id=w.car")
                .addScalar("carName")
                .addScalar("dateInfo")
                .addScalar("exchange")
                .addScalar("price")
                .setResultTransformer(Transformers.aliasToBean(InformationDTO.class))
                .list();

    }

    @Override
    public List<InformationDTO> getInformationAboutRefueling() {
        return null;
    }

    @Override
    public CarBD getById(Integer id) {
        return (CarBD) getSession().createCriteria(CarBD.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }
}
