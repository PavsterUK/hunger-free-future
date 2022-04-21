package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.service.foodbank.FoodBankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/v1/api")
public class FoodBankController {

    private FoodBankServiceImpl fbServImpl;

    @Autowired
    public FoodBankController(FoodBankServiceImpl fbServImpl) {
        this.fbServImpl = fbServImpl;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/foodbanks-within")
    public List<Map<String, String>> withinBounds(@RequestParam Map<String, String> boundaries) {
        Double swLat = Double.valueOf(boundaries.get("swLat"));
        Double swLng = Double.valueOf(boundaries.get("swLng"));
        Double neLat = Double.valueOf(boundaries.get("neLat"));
        Double neLng = Double.valueOf(boundaries.get("neLng"));
        return fbServImpl.withinBounds(swLat, swLng, neLat, neLng);
    }
}
