package com.nbicocchi.exercises.examples;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        BiFunction<String, String, Integer> f2 = (s1, s2) -> s1.length() + s2.length();
        Consumer<String> f3 = s -> System.out.println(s);
        Predicate<String> f4 = s -> s.length() < 6;
    }
}
