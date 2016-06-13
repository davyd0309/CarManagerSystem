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
    public List<InformationDTO> getInformation() {
//        return getSession().createCriteria(CarBD.class, "car")
//                .createAlias("car.exchangeList", "exchangeList")
//                .createAlias("car.refuelingList", "refuelingList")
//                .setProjection(Projections.projectionList()
//                        .add(Projections.property("car.carName"), "carName")
//                        .add(Projections.property("exchangeList.exchangeDescription"), "exchange")
//                        .add(Projections.property("refuelingList.refuelingDescription"), "refueling"))
//                .setResultTransformer(
//                        Transformers.aliasToBean(InformationDTO.class)).list();

return new ArrayList<InformationDTO>();
    }

    @Override
    public CarBD getById(Integer id) {
        return (CarBD) getSession().createCriteria(CarBD.class)
                .add(Restrictions.eq("id",id)).uniqueResult();
    }
}
