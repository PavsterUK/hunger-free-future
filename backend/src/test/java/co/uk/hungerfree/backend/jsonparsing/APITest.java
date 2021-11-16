package co.uk.hungerfree.backend.jsonparsing;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;


class APITest {

    @Test
    void readJsonFromUrlToString() throws MalformedURLException {
        String json = API.readJsonFromUrlToString(new URL("https://jsonplaceholder.typicode.com/users"));
        assertEquals(removeWhiteSpaces(json), removeWhiteSpaces(BigJsonExampleString.getJsonString()));
    }

    private String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

}