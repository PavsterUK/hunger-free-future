package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.service.location.LocationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/v1/api")
public class LocationController {

    LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all-salvation-army-with-needs")
    public List<Map<String, String>> findAllWithNeeds() throws JsonProcessingException {
        return locationService.findAllSalvationArmyWithNeeds();
    }
}
