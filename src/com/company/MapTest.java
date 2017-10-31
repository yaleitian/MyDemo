package com.company;

import com.model.CarModel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    private  void printMapMethod(Map<String,CarModel> carModelMap) {
        Iterator<Map.Entry<String,CarModel>> iterator = carModelMap.entrySet().iterator();
        System.out.println("===============循环打印Map开始===================");
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "  ==  " + value);
        }
        System.out.println("=================循环打印Map结束=================");
    }
    public static void main(String[] args) {
        Map<String, CarModel> carModelMap = new HashMap<String,CarModel>();
        CarModel carModel = new CarModel();
        carModel.setCarName("MX-5");
        carModel.setCarMaster("Lee");
        carModel.setCarAge(1);

        CarModel carModel2 = new CarModel();
        carModel2.setCarName("atenza");
        carModel2.setCarMaster("Tee");
        carModel2.setCarAge(2);
        carModelMap.put("1",carModel);
        carModelMap.put("2",carModel2);
        MapTest mapTest = new MapTest();
        mapTest.printMapMethod((Map<String, CarModel>) carModelMap);
    }
}
