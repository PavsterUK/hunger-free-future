package co.uk.hungerfree.backend.controller;


import co.uk.hungerfree.backend.service.location.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/v1/api")
public class LocationController {

    private final LocationServiceImpl locationServiceImpl;

    @Autowired
    public LocationController(LocationServiceImpl locationServiceImpl) {
        this.locationServiceImpl = locationServiceImpl;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/locations-within")
    public List<Map<String, String>> withinBounds(@RequestParam Map<String, String> boundaries) {
        Double swLat = Double.valueOf(boundaries.get("swLat"));
        Double swLng = Double.valueOf(boundaries.get("swLng"));
        Double neLat = Double.valueOf(boundaries.get("neLat"));
        Double neLng = Double.valueOf(boundaries.get("neLng"));
        return locationServiceImpl.withinBounds(swLat, swLng, neLat, neLng);
    }

}

