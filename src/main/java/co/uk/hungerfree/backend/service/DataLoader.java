package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.API;
import co.uk.hungerfree.backend.csvparsing.CSV;
import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.model.TownFinder;
import co.uk.hungerfree.backend.model.foodbank.entity.FoodBank;
import co.uk.hungerfree.backend.model.location.entity.Location;
import co.uk.hungerfree.backend.model.need.entity.Need;
import co.uk.hungerfree.backend.service.foodbank.FoodBankServiceImpl;
import co.uk.hungerfree.backend.service.location.LocationServiceImpl;
import co.uk.hungerfree.backend.service.town.fnder.TownFinderServiceImpl;
import co.uk.hungerfree.backend.service.needs.NeedServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class DataLoader implements ApplicationRunner {

    private FoodBankServiceImpl foodBankServiceImpl;
    private NeedServiceImpl needServiceImpl;
    private LocationServiceImpl locationServiceImpl;
    private TownFinderServiceImpl ukAddressServiceImpl;

    @Autowired
    public DataLoader(FoodBankServiceImpl foodBankServiceImpl, NeedServiceImpl needServiceImpl, LocationServiceImpl locationServiceImpl, TownFinderServiceImpl ukAddressServiceImpl) {
        this.foodBankServiceImpl = foodBankServiceImpl;
        this.needServiceImpl = needServiceImpl;
        this.locationServiceImpl = locationServiceImpl;
        this.ukAddressServiceImpl = ukAddressServiceImpl;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        fromApiToDatabase();
    }

    //Load data to database
    public void fromApiToDatabase() throws JsonProcessingException, MalformedURLException {

        List<TownFinder> townFinderList = CSV.parse();

        String foodBanksString = API.fetch(
                new URL("https://www.givefood.org.uk/api/2/foodbanks/"));

        String needsString =  API.fetch(
                new URL("https://www.givefood.org.uk/api/2/needs/"));

        String locationsString =  API.fetch(
                new URL("https://www.givefood.org.uk/api/2/locations/"));


        needServiceImpl.saveAll(Json.mapToObj(needsString, Need.class));
        foodBankServiceImpl.saveAll(Json.mapToObj(foodBanksString, FoodBank.class));
        locationServiceImpl.saveAll(Json.mapToObj(locationsString, Location.class));
        ukAddressServiceImpl.saveAll(townFinderList);

    }




}
