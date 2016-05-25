package com.cert.enums;

import java.util.EnumMap;

/**
 * Created by sridhar on 17/2/16.
 */
public class Program {
    enum Importance {
        Low, Medium, High, Critical
    };

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        System.out.println(Day.values()); // Day[]
        System.out.println(Day.valueOf("SUNDAY"));//returns Day.SUNDAY

        EnumMap<Importance, String> map = new EnumMap<>(Importance.class);
        map.put(Importance.Low, "=Low");
        map.put(Importance.High, "=High");

        String value1 = map.get(Importance.Low);

        System.out.println(value1);

    }
}
