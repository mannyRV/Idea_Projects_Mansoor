package com.revature.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Tom","Edward","Abdo","munir", "Bassam","Ahmed","wail","Ayad");

        String strList =
                list
                .stream()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(strList);
    }
}
