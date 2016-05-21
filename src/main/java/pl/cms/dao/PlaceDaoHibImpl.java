package pl.cms.dao;

import org.springframework.stereotype.Repository;
import pl.cms.model.PlaceBD;
import pl.cms.model.UserBD;

/**
 * Created by Konrad Dawydiuk on 09.04.2016.
 */
@Repository
public class PlaceDaoHibImpl extends GenericDaoImpl<PlaceBD,Integer> implements PlaceDao{

    public PlaceDaoHibImpl() {
        super(PlaceBD.class);
    }
}
