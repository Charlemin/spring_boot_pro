package com.zm.boot;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Eric on 2016/6/28.
 */
public class JsonTest {
    public static void main(String[] args) {
        String jsonString = "{\"code\":0,\"data\":[{\"id\":2,\"name\":\"zha\"},{\"id\":7,\"name\":\"zha\"}],\"message\":\"\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String,Object> map = objectMapper.readValue(jsonString, Map.class);
            List<Map<String,Object>> policiesList = (List<Map<String,Object>>) map.get("data");
            for(Map<String,Object> policy : policiesList)
                System.out.println(policy.get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
