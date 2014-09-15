package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.lang.System.*;

/**
 * Example of net Java 8 lambda syntax
 */
public class Main {
    public static void main(String[] args) {
        out.println("sdfa");
        List<String> strings = Arrays.asList("foo", "bar", "baz");
        strings.forEach(err::println);
        strings.forEach((t) -> err.println(t));


//        Stream<String> = new Stream<String>();

        Supplier<String> foo = new Supplier<String>() {
            int count = 0;
            @Override
            public String get() {
                count++;
                return "count:" + ( count -1) + "";
            }
        };
        Stream.generate(foo).limit(10).forEach(err::println);
    }
}