package pl.cms.service;

import pl.cms.model.PlaceBD;

import java.util.List;

/**
 * Created by Konrad Dawydiuk on 21.05.2016.
 */
public interface PlaceService {
    PlaceBD saveOrUpdate(PlaceBD place);
    List getAll();
}
