package pl.cms.dao;

import org.springframework.stereotype.Repository;
import pl.cms.model.ExchangeBD;
import pl.cms.model.RefuelingBD;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@Repository
public class ExchangeDaoHibImpl extends GenericDaoImpl<ExchangeBD,Integer> implements ExchangeDao {

    public ExchangeDaoHibImpl() {
        super(ExchangeBD.class);
    }
}
