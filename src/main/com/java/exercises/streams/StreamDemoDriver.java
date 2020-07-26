package main.com.java.exercises.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoDriver {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> employees = Arrays.asList(arrayOfEmps);

    public static void main(String... args) {

        /**
         * Stream creation
         */
        Stream.of(arrayOfEmps);

        /**
         * obtain from existing List
         */
        employees.stream();

        /**
         * create from individual element
         */
        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

    }
}
