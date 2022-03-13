package co.uk.hungerfree.backend.controller;

import co.uk.hungerfree.backend.service.FoodBankServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class FoodBankController {

    FoodBankServiceImpl fbServImpl;

    @Autowired
    public FoodBankController(FoodBankServiceImpl fbServImpl) {
        this.fbServImpl = fbServImpl;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/food_bank_list")
    public String getAllFoodBanks() throws JsonProcessingException {
        return  fbServImpl.listAll();
    }
}
