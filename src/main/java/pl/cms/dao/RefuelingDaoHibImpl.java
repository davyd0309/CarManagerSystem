package pl.cms.dao;

import org.springframework.stereotype.Repository;
import pl.cms.model.RefuelingBD;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@Repository
public class RefuelingDaoHibImpl extends GenericDaoImpl<RefuelingBD,Integer> implements RefuelingDao {

    public RefuelingDaoHibImpl() {
        super(RefuelingBD.class);
    }
}
