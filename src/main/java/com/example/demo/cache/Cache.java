package com.example.demo.cache;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {

//    public static void main(String[] args) {
//        System.out.println(authorization("user1", "1"));
//        System.out.println(authorization("user2", "3"));
//        System.out.println(authorization("admin", "123"));
//    }
    private static List<String> uriListEnds = Arrays.asList(
            "demo/saveServlet",
            "demo/viewByIDServlet",
            "demo/loginServlet",
            "demo/viewServlet");
    private static Map<String, String> passwordMap = new HashMap<>() {{
        put("admin", "123");
        put("user1", "1");
        put("user2", "2");
        put("user3", "3");
        put("user4", "4");
    }};

    public static Boolean compare(String uri){
        return uriListEnds.stream().anyMatch(uriItem -> uri.endsWith(uriItem));
    }
    public static Boolean authorize(String user, String password){
        return passwordMap.entrySet().stream()
                .anyMatch(entry -> entry.getKey().equals(user) && entry.getValue().equals(password));
    }
}
