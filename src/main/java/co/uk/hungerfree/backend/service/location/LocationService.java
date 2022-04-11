package co.uk.hungerfree.backend.service.location;

import co.uk.hungerfree.backend.model.location.entity.Location;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface LocationService {

    public List<Location> findAll() throws JsonProcessingException;

    public void saveAll(List<Location> locationList);

    public List<Location> getLocationsByIds(List<String> ids);

    List<Map<String, String>> findAllSalvationArmyWithNeeds();
}
