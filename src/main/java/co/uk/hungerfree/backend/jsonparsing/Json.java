package co.uk.hungerfree.backend.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class Json {

    private static final ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        return defaultObjectMapper;

    }

    public static JsonNode parse(String src) throws JsonProcessingException {
         return objectMapper.readTree(src);
    }

    public static <A> A fromJson(JsonNode node, Class<A> klass) throws JsonProcessingException {
        return objectMapper.treeToValue(node, klass);
    }

    public static JsonNode toJson(Object a) {
        return objectMapper.valueToTree(a);
    }

    public static String stringify(JsonNode node) throws JsonProcessingException {
        ObjectWriter objectWriter = objectMapper.writer();

        return objectWriter.writeValueAsString(node);
    }

    public static <T> List<T> mapToObj(String jsonList, Class<T> klass) throws JsonProcessingException {
        CollectionType javaType = objectMapper
                .getTypeFactory()
                .constructCollectionType(List.class, klass);

        return objectMapper.readValue(jsonList, javaType);
    }





}
