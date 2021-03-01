package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;
import com.sun.jdi.IntegerValue;
import com.sun.jdi.connect.Connector;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Warszawa");
        list.add("Palermo");
        list.add("Tokio");

        for (String city : list) {
            System.out.println(city);
        }

        list.remove("Warszawa");
        list.clear();

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Poland", "Warsaw");
        capitalCities.put("GB", "London");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("onomatopeja", "reprezentuje biedę");

        System.out.println(capitalCities.get("Poland"));
        System.out.println(capitalCities.get("onomatopeja"));

        Map<String, Human> humanByNames = new HashMap<>();
        humanByNames.put("kacper", new Human("kacper"));
        Human human = new Human("karolina");
        humanByNames.put(human.firstName, human);


        humanByNames.get("kacper");
        humanByNames.remove("kacper");

        humanByNames.put("karolina", new Human("kasia"));
        humanByNames.put("kasia", new Human("kasia"));

        for (Human someone : humanByNames.values()) {
            System.out.println(someone);
        }

        for (String name : humanByNames.keySet()) {
            System.out.println(humanByNames.get(name));
        }
//        zadanie posortowanie po car alfabetycznie

        Map<String, Car> cars = new TreeMap<String, Car>();
        cars.put("car-Polo", new Car(2002, "Golf", "Polo", "blue", 5000.0));
        cars.put("car-Focus", new Car(2020, "Ford", "Focus", "grey", 20000.0));
        cars.put("car-Astra", new Car(2000, "Opel", "Astra", "red", 3000.00));
        cars.put("car-Fabia", new Car(1997, "Skoda", "Fabia", "black", 6000.00));

//
//        Set<Map.Entry<String, Car>> entrySet = cars.entrySet();
//        for (Map.Entry<String, Car> entry : entrySet) {
//            System.out.println(entry.getKey());



        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}
















//        TreeMap<String, Integer> mapa = new TreeMap<>();
//        mapa.put("Polska", 3000);
//        mapa.put("Australia", 7692000);
//        mapa.put("Russia", 17100000);
//        mapa.put("China", 9597000);
//        mapa.put("USA", 9834000);
//
//
//    }
//    }


