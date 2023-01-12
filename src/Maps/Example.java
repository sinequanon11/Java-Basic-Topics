package Maps;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        // MAP: set of key and value
        // Map'lerde (String, Integer) gibi "full java wrapper classes" kullanmalıyız.
        // Map'lerde primitive'ler kullanılamıyor (küçük harfler yazılanlar, int, double vs.)

        Map<String, Integer> empIDs=new HashMap<>(); // Employee names and ID numbers
        empIDs.put("John", 11111);
        empIDs.put("Carl", 22222);
        empIDs.put("Jerry", 33333);

        System.out.println( empIDs);

        System.out.println( empIDs.get("Carl"));

        System.out.println( empIDs.containsKey("George"));

        System.out.println(empIDs.containsValue(33333));

        empIDs.put("John",66666);
        System.out.println(empIDs);

        empIDs.replace("John", 77777);
        System.out.println(empIDs);

        empIDs.putIfAbsent("Steve", 88888);
        System.out.println(empIDs);

        empIDs.remove("Steve");
        System.out.println(empIDs);

    }
}
