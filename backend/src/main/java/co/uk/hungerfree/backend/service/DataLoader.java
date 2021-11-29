package co.uk.hungerfree.backend.service;

import co.uk.hungerfree.backend.jsonparsing.API;
import co.uk.hungerfree.backend.jsonparsing.Json;
import co.uk.hungerfree.backend.model.entity.foodBankEntity.FoodBank;
import co.uk.hungerfree.backend.model.entity.locationEntity.Location;
import co.uk.hungerfree.backend.model.entity.needEntity.Need;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class DataLoader implements ApplicationRunner {

    private FoodBankServiceImpl foodBankServiceImpl;
    private NeedServiceImpl needServiceImpl;
    private LocationServiceImpl locationServiceImpl;

    @Autowired
    public DataLoader(FoodBankServiceImpl foodBankServiceImpl, NeedServiceImpl needServiceImpl, LocationServiceImpl locationServiceImpl) {
        this.foodBankServiceImpl = foodBankServiceImpl;
        this.needServiceImpl = needServiceImpl;
        this.locationServiceImpl = locationServiceImpl;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        fromApiToDatabase();
    }

    //Load initial data to database
    public void fromApiToDatabase() throws JsonProcessingException, MalformedURLException {
        String foodBanksString = API.readJsonFromUrlToString(
                new URL("https://www.givefood.org.uk/api/2/foodbanks/"));

        String needsString =  API.readJsonFromUrlToString(
                new URL("https://www.givefood.org.uk/api/2/needs/"));

        String locationsString =  API.readJsonFromUrlToString(
                new URL("https://www.givefood.org.uk/api/2/locations/"));


        needServiceImpl.saveAll(Json.stringToObjList(needsString, Need.class));
        foodBankServiceImpl.saveAll(Json.stringToObjList(foodBanksString, FoodBank.class));
        locationServiceImpl.saveAll(Json.stringToObjList(locationsString, Location.class));

    }




}
