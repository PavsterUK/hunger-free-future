package co.uk.hungerfree.backend.jsonparsing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;



class APITest {

    @Test
    void readJsonFromUrlToString() throws MalformedURLException {
        String json = API.readJsonFromUrlToString(new URL("https://jsonplaceholder.typicode.com/users"));
        Assertions.assertEquals(removeWhiteSpaces(json), removeWhiteSpaces(TestJsonString.getJsonString()));
    }

    private String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

}