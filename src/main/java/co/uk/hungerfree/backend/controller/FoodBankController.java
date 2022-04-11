package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.model.foodbank.entity.FoodBank;
import co.uk.hungerfree.backend.service.foodbank.FoodBankServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/v1/api")
public class FoodBankController {

    FoodBankServiceImpl fbServImpl;

    @Autowired
    public FoodBankController(FoodBankServiceImpl fbServImpl) {
        this.fbServImpl = fbServImpl;
    }


    @GetMapping("/foodbanks")
    public List<FoodBank> all() throws JsonProcessingException {
        return fbServImpl.findAll();
    }

    @GetMapping("/foodbanks-with-needs")
    public List<Map<String, String>> cal() throws JsonProcessingException {
        return fbServImpl.allFbInclNeeds();
    }

    @GetMapping("/foodbanks/{slug}")
    public FoodBank getBySlug(@PathVariable String slug) {
        return fbServImpl.findById(slug);
    }
}
