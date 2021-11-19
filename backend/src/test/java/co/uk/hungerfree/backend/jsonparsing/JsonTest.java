package co.uk.hungerfree.backend.jsonparsing;

import co.uk.hungerfree.backend.jsonparsing.pojo.SimpleTestCasePOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JsonTest {

    private  String simpleJsonTestCase ="{\"name\":\"JamesBond\",\"profession\":\"SpecialAgent\"}";

    private  String simpleJsonTestCaseList ="[{\"name\":\"Batman\",\"profession\":\"SuperHero\"}," +
            "{\"name\":\"PeterPan\",\"profession\":\"StoryCharacter\"}," +
            "{\"name\":\"PeppaPig\",\"profession\":\"CartoonCharacter\"}" +
            "]";

    @Test
    void parse() throws JsonProcessingException {
        JsonNode node = Json.parse(simpleJsonTestCase);
        assertEquals(node.get("name").asText(), "JamesBond");
    }

    @Test
    void fromJson() throws JsonProcessingException {
        JsonNode node = Json.parse(simpleJsonTestCase);
        SimpleTestCasePOJO pojo = Json.fromJson(node, SimpleTestCasePOJO.class);
        assertEquals(pojo.getName(), "JamesBond");
    }

    @Test
    void toJson() throws JsonProcessingException {
        SimpleTestCasePOJO pojo = new SimpleTestCasePOJO();
        pojo.setName("Test1");
        JsonNode node = Json.toJson(pojo);
        assertEquals(node.get("name").asText(), "Test1");
    }

    @Test
    void stringify() throws JsonProcessingException {
        JsonNode node = Json.parse(simpleJsonTestCase);
        String jsonString = Json.stringify(node);
        assertEquals(jsonString, simpleJsonTestCase);
    }

    @Test
    void StringToJsonList() throws JsonProcessingException {
        List<SimpleTestCasePOJO> testList = new ArrayList<>();
        testList.add(new SimpleTestCasePOJO("Batman", "SuperHero"));
        testList.add(new SimpleTestCasePOJO("PeterPan", "StoryCharacter"));
        testList.add(new SimpleTestCasePOJO("PeppaPig", "CartoonCharacter"));

        List<SimpleTestCasePOJO> listFromString = Json.stringToJsonList(simpleJsonTestCaseList, SimpleTestCasePOJO.class);

        //Lists match
        Assertions.assertTrue(compSimpleTestCasePOJOLists(testList, listFromString));

        //Lists do not match
        testList.get(0).setName("RatMan");
        Assertions.assertFalse(compSimpleTestCasePOJOLists(testList, listFromString));
    }

    private boolean compSimpleTestCasePOJOLists(List<SimpleTestCasePOJO> testList , List<SimpleTestCasePOJO> listFromString) {
        if (testList.size() != listFromString.size())
            return false;

        for (int i = 0; i < testList.size(); i++) {
            if (!(testList.get(i).getName()
                    .equals(listFromString.get(i).getName()) &&
                    testList.get(i).getProfession().equals(listFromString.get(i).getProfession()))
            ) {
                return false;
            }
        }
        return true;
    }




}