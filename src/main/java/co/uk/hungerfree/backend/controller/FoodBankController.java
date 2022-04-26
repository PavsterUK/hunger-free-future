package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.service.foodbank.FoodBankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/v1/api")
public class FoodBankController {

    private final FoodBankServiceImpl fbServImpl;

    @Autowired
    public FoodBankController(FoodBankServiceImpl fbServImpl) {
        this.fbServImpl = fbServImpl;
    }

    @GetMapping("/foodbanks-within/{swLat}/{swLng}/{neLat}/{neLng}")
    public List<Map<String, String>> withinBounds(@PathVariable(value = "swLat") String swLat,
                                                  @PathVariable(value = "swLng") String swLng,
                                                  @PathVariable(value = "neLat") String neLat,
                                                  @PathVariable(value = "neLng") String neLng) {
        return fbServImpl.withinBounds(
                Double.valueOf(swLat),
                Double.valueOf(swLng),
                Double.valueOf(neLat),
                Double.valueOf(neLng));
    }
}

