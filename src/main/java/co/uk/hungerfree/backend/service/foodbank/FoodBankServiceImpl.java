package co.uk.hungerfree.backend.service.foodbank;

import co.uk.hungerfree.backend.model.foodbank.FoodBank;
import co.uk.hungerfree.backend.repository.FoodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FoodBankServiceImpl implements FoodBankService {

    private final FoodBankRepository foodBankRepo;

    @Autowired
    public FoodBankServiceImpl(FoodBankRepository foodBankRepo) {
        this.foodBankRepo = foodBankRepo;
    }

    public List<FoodBank> saveAll(List<FoodBank> foodBankList) {
        return foodBankRepo.saveAll(foodBankList);
    }

    @Override
    public List<Map<String, String>> withinBounds(Double swLat,
                                                  Double swLng,
                                                  Double neLat,
                                                  Double neLng) {
        return foodBankRepo.withinBoundsIncludingNeeds(swLat, swLng, neLat, neLng);
    }

}
