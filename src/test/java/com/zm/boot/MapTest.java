package com.zm.boot;

import org.codehaus.jackson.map.ObjectMapper;

import javax.lang.model.element.NestingKind;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eric on 2016/6/28.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String,String> hmap= new HashMap<String,String>();
        hmap.put("1","jackson");
        hmap.put("2","michael");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(hmap);
            System.out.println(json);
            objectMapper.writeValue(System.out,hmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(hmap);
    }
}
