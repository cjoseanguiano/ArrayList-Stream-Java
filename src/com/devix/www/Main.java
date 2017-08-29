package com.devix.www;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(200);
        list.add(3000);

        Stream<Integer> stream = list.stream();

        boolean result = stream.allMatch(value -> value >= 5);
        System.out.println(result);
    }
}
