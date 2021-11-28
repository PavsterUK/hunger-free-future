package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.model.entities.locationEntity.Location;
import co.uk.hungerfree.backend.repository.LocationRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public String listAll() throws JsonProcessingException {
        JsonNode node = Json.toJson(locationRepository.findAll());

        return Json.stringify(node);
    }

    @Override
    public void saveAll(List<Location> locationList) {
        locationRepository.saveAll(locationList);
    }

    @Override
    public List<Location> getLocationsByIds(List<String> ids) {
        return locationRepository.findAllById(ids);
    }
}
