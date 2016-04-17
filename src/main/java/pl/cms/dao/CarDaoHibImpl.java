package pl.cms.dao;

import org.springframework.stereotype.Repository;
import pl.cms.model.CarBD;

/**
 * Created by Konrad on 17.04.2016.
 */
@Repository
public class CarDaoHibImpl extends GenericDaoImpl<CarBD,Integer> implements CarDao{

    public CarDaoHibImpl() {
        super(CarBD.class);
    }
}
