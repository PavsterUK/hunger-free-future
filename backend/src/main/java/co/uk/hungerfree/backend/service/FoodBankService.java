package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.FoodBank;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodBankService {

    private FoodBankRepository foodBankRepo;

    public FoodBankService() {
    }

    @Autowired
    public FoodBankService(FoodBankRepository foodBankRepo) {
        this.foodBankRepo = foodBankRepo;
    }

    public void saveAll(List<FoodBank> foodBankList) {
        foodBankRepo.saveAll(foodBankList);
    }

    @Query("SELECT " +
            "name," +
            "country," +
            "email," +
            "phone," +
            "lat_lng" +
            "closed" +
            "address" +
            "slug" +
            "postcode" +
            "needs" +
            " FROM FOOD_BANK " +
            "INNER JOIN NEED" +
            "ON FOOD_BANK.slug = NEED.slug" )
    public List<FoodBank> getFoodBankListByIds(List<String> ids) {
        return foodBankRepo.findAllById(ids);
    }






}
