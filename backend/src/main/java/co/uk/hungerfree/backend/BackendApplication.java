package co.uk.hungerfree.backend;

import co.uk.hungerfree.backend.domain.FoodBank;
import co.uk.hungerfree.backend.domain.Need;
import co.uk.hungerfree.backend.jsonparsing.API;
import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.service.FoodBankService;
import co.uk.hungerfree.backend.service.NeedService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
		SpringApplication.run(BackendApplication.class, args);

		String foodBanksString = API.readJsonFromUrlToString(new URL("https://www.givefood.org.uk/api/2/foodbanks/"));
		String needsString =  API.readJsonFromUrlToString(new URL("https://www.givefood.org.uk/api/2/needs/"));

		List<FoodBank> fbList = Json.stringToJsonList(foodBanksString, FoodBank.class);

		List<Need> needList = Json.stringToJsonList(needsString, Need.class);

		FoodBankService.saveAll(fbList);
		NeedService.saveAll(needList);







	}

}


