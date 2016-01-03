package pl.cms.dao;

import org.springframework.data.repository.CrudRepository;
import pl.cms.model.ExchangeBD;

/**
 * Created by Konrad on 03.01.2016.
 */
public interface ExchangeDao extends CrudRepository<ExchangeBD,Integer> {
}
