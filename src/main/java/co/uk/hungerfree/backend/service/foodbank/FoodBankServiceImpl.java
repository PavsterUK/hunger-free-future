package co.uk.hungerfree.backend.service.foodbank;

import co.uk.hungerfree.backend.exceptions.FoodBankNotFoundException;
import co.uk.hungerfree.backend.model.foodbank.entity.FoodBank;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodBankServiceImpl implements FoodBankService {

    private FoodBankRepository foodBankRepo;

    public FoodBankServiceImpl() {
    }

    @Autowired
    public FoodBankServiceImpl(FoodBankRepository foodBankRepo) {
        this.foodBankRepo = foodBankRepo;
    }

    @Override
    public List<FoodBank> findAll() throws JsonProcessingException {
        return foodBankRepo.findAll();
    }

    public List<FoodBank> saveAll(List<FoodBank> foodBankList) {
        return foodBankRepo.saveAll(foodBankList);
    }

    @Override
    public FoodBank findById(String id) {
        return foodBankRepo.findById(id)
                .orElseThrow(() -> new FoodBankNotFoundException(id));
    }

    @Override
    public List<Map<String, String>> allFbInclNeeds() {
        return foodBankRepo.allFbInclNeeds();
    }

}
