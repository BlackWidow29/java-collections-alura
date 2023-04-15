package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Aula1Listas {

    protected void listas() {
        String s1 = "string 10";
        String s2 = "string 5";
        String s3 = "string 35";

        ArrayList<String> strings = new ArrayList<>();

        strings.add(s1);
        strings.add(s2);
        strings.add(s3);

        System.out.println(strings);

        strings.remove(0);

        System.out.println(strings);

        for (String string :
                strings) {
            System.out.println("String: " + string);
        }

        String string = strings.get(0);

        System.out.println(string);

        strings.forEach(s -> {
            System.out.println(s.indexOf(s));
        });

        strings.add(s1);
        strings.add("string 045");

        Collections.sort(strings);

        System.out.println(strings);
    }
}
