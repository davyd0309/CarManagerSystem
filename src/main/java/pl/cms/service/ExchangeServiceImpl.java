package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.ExchangeDao;
import pl.cms.dao.RefuelingDao;
import pl.cms.model.ExchangeBD;
import pl.cms.model.RefuelingBD;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@Service
@Transactional
public class ExchangeServiceImpl implements ExchangeService {

    private ExchangeDao exchangeDao;

    @Autowired
    public ExchangeServiceImpl(ExchangeDao exchangeDao) {
        this.exchangeDao = exchangeDao;
    }

    @Override
    public void saveOrUpdate(ExchangeBD exchange) {
        exchangeDao.saveOrUpdate(exchange);
    }
}
