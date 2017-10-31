package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "linlin");
        map.put("second", "bingbing");
        map.put("third", "wenwen");
        map.put("first", "linlin2");


        // 第一种：通过Map.keySet遍历key和value     
        System.out.println("===================通过Map.keySet遍历key和value:===================");
        for (String key : map.keySet()) {
            System.out.println("key= " + key + "  and  value= " + map.get(key));
        }

        // 第二种：通过Map.entrySet使用iterator遍历key和value     
        System.out.println("===================通过Map.entrySet使用iterator遍历key和value:===================");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + "  and  value= "
                    + entry.getValue());
        }

        // 第三种：通过Map.entrySet遍历key和value     
        System.out.println("===================通过Map.entrySet遍历key和value:===================");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + "  and  value= "
                    + entry.getValue());
        }

        // 第四种：通过Map.values()遍历所有的value，但是不能遍历键key     
        System.out.println("===================通过Map.values()遍历所有的value:===================");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }
    }

} 