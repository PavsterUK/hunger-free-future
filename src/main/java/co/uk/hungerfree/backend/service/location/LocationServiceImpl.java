package co.uk.hungerfree.backend.service.location;

import co.uk.hungerfree.backend.model.location.entity.Location;
import co.uk.hungerfree.backend.repository.LocationRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() throws JsonProcessingException {
        return locationRepository.findAll();
    }

    @Override
    public void saveAll(List<Location> locationList) {
        locationRepository.saveAll(locationList);
    }

    @Override
    public List<Location> getLocationsByIds(List<String> ids) {
        return locationRepository.findAllById(ids);
    }

    @Override
    public List<Map<String, String>> findAllSalvationArmyWithNeeds() {
        return locationRepository.findAllSalvationArmyWithNeeds();
    }
}
