package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.entity.locationEntity.Location;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {

    public String listAll() throws JsonProcessingException;

    public void saveAll(List<Location> locationList);

    public List<Location> getLocationsByIds(List<String> ids);
}
