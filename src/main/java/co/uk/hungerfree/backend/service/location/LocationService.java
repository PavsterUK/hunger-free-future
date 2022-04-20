package co.uk.hungerfree.backend.service.location;

import co.uk.hungerfree.backend.model.location.Location;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface LocationService {

    public void saveAll(List<Location> locationList);

    List<Map<String, String>> findAllSalvationArmyWithNeeds();
}
