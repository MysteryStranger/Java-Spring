package com.example.lec_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Lec1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lec1Application.class, args);

        var message = ("Hello World!");
        System.out.println(message); //sout

String a = "abc";
String b = "abc";

var dif = a.compareTo(b); //-2
        System.out.println(dif);
        /*
        var lst = List.of(
                new Person("Dart", "Vlados"),
                new Person("Andrew", "Kampf"),
                new Person("Kate", "Spy"),
                new Person("Dark", "Ness")
                  );

         */

        howToSortNumbers();

    }

    private static void howToSortNumbers() {
        var lst2 = new ArrayList<>(List.of(1, 2, 3, 10, 3));
        Collections.sort(lst2);
        System.out.println(lst2);
    }

}
