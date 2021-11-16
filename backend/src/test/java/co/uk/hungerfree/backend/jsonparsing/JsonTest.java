package co.uk.hungerfree.backend.jsonparsing;

import co.uk.hungerfree.backend.jsonparsing.pojo.SimpleTestCasePOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JsonTest {

    String simpleJsonTestCase ="{\"name\":\"JamesBond\",\"profession\":\"SpecialAgent\"}";

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

}