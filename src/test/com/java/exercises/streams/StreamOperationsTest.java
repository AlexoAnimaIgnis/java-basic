package test.com.java.exercises.streams;


import main.com.java.exercises.streams.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class StreamOperationsTest {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private List<Employee> employeeList = Arrays.asList(arrayOfEmps);

    @Test
    public void operationForEach() {
        employeeList.stream().forEach( e -> { e.salaryIncrement(10.0);});

        assertThat(employeeList, contains(
                hasProperty("salary", equalTo(100010.0)),
                hasProperty("salary", equalTo(200010.0)),
                hasProperty("salary", equalTo(300010.0))
        ));
    }

    @Test
    public void operationMap() {

    }

    @Test
    public void operationCollect() {

    }

    @Test
    public void operationFilter() {

    }

    @Test
    public void operationFindFirst() {

    }

    @Test
    public void operationToArray() {

    }

    @Test
    public void operationFlatMap() {

    }

    @Test
    public void operationPeek() {

    }
}
