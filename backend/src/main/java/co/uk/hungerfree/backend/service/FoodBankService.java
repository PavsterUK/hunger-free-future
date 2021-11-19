package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.domain.FoodBank;
import co.uk.hungerfree.backend.domain.Need;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodBankService {

    private static FoodBankRepository foodBankRepo;

    public FoodBankService() {
    }

    @Autowired
    public FoodBankService(FoodBankRepository foodBankRepo) {
        FoodBankService.foodBankRepo = foodBankRepo;
    }


    public static void saveAll(List<FoodBank> foodBankList) {
        foodBankRepo.saveAll(foodBankList);
    }



}
