package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.model.entities.foodBankEntity.FoodBank;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodBankServiceImpl implements FoodBankService{

    private FoodBankRepository foodBankRepo;

    public FoodBankServiceImpl() {
    }

    @Autowired
    public FoodBankServiceImpl(FoodBankRepository foodBankRepo) {
        this.foodBankRepo = foodBankRepo;
    }

    @Override
    public String listAll() throws JsonProcessingException {
        JsonNode node = Json.toJson(foodBankRepo.findAll());

        return Json.stringify(node);
    }

    public void saveAll(List<FoodBank> foodBankList) {
        foodBankRepo.saveAll(foodBankList);
    }


    public List<FoodBank> getFoodBanksByIds(List<String> ids) {
        return foodBankRepo.findAllById(ids);
    }









}
