package co.uk.hungerfree.backend.service.foodbank;

import co.uk.hungerfree.backend.model.foodbank.entity.FoodBank;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Map;

public interface FoodBankService {

    public List<FoodBank> findAll() throws JsonProcessingException;

    public List<FoodBank> saveAll(List<FoodBank> foodBankList);

    public FoodBank findById(String id);

    List<Map<String,String>> allFbInclNeeds();
}
