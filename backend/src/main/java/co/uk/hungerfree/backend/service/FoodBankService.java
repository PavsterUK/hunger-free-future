package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.model.entities.foodBankEntity.FoodBank;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface FoodBankService {

    public String listAll() throws JsonProcessingException;

    public void saveAll(List<FoodBank> foodBankList);

    public List<FoodBank> getFoodBanksByIds(List<String> ids);


}
