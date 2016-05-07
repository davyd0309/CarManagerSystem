package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.RefuelingDao;
import pl.cms.model.RefuelingBD;

/**
 * Created by Konrad Dawydiuk on 07.05.2016.
 */
@Service
@Transactional
public class RefuelingServiceImpl implements RefuelingService {

    private RefuelingDao refuelingDao;

    @Autowired
    public RefuelingServiceImpl(RefuelingDao refuelingDao) {
        this.refuelingDao = refuelingDao;
    }

    @Override
    public void saveOrUpdate(RefuelingBD refueling) {
            refuelingDao.saveOrUpdate(refueling);
    }
}
