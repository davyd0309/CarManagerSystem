package pl.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.cms.dao.PlaceDao;
import pl.cms.model.PlaceBD;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 21.05.2016.
 */

@Service
@Transactional
public class PlaceServiceImpl implements PlaceService{

    private PlaceDao placeDao;

    @Autowired
    public PlaceServiceImpl(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }


    @Override
    public PlaceBD saveOrUpdate(PlaceBD place) {
        placeDao.saveOrUpdate(place);
        return place;
    }

    @Override
    public List getAll() {
        return placeDao.findAll();
    }
}
