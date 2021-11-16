package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.pojos.FoodBankPOJO;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodBankService {

    FoodBankRepository foodBankRepo;

    @Autowired
    public FoodBankService(FoodBankRepository foodBankRepo) {
        this.foodBankRepo = foodBankRepo;
    }

    public FoodBankPOJO save(FoodBankPOJO foodBank) {
        return foodBankRepo.save(foodBank);
    }


}
