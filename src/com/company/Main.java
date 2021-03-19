package com.company;

import com.company.creatures.Human;
import com.company.devices.Car;
import com.sun.jdi.IntegerValue;
import com.sun.jdi.connect.Connector;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       String query =  "select * from teacher";
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


// wyznacz najmniejsze i największe państwo

        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("Polska", 320678);
        map.put("Grecja", 131990);
        map.put("Niemcy", 350385);
        map.put("Hiszpania", 505998);
        map.put("Francja", 643802);


        Integer min = Collections.min(map.values());
        Integer max = Collections.max(map.values());
        System.out.println(min + " Najmniejsze państwo");
        System.out.println(max + " Największe państwo");
    }
}







