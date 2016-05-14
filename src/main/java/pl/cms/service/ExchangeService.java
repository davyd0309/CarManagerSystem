package pl.cms.service;

import pl.cms.model.ExchangeBD;
import pl.cms.model.RefuelingBD;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
public interface ExchangeService {
    void saveOrUpdate(ExchangeBD exchange);
}
