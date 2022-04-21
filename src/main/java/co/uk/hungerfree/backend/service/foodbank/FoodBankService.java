package co.uk.hungerfree.backend.service.foodbank;

import co.uk.hungerfree.backend.model.foodbank.FoodBank;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface FoodBankService {

    public List<FoodBank> saveAll(List<FoodBank> foodBankList);

    List<Map<String,String>> withinBounds(Double swLat,
                                          Double swLng,
                                          Double neLat,
                                          Double neLng);
}
