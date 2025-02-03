package mapdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

int empId;
String empName;
int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class Mapdemo4Filter {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alex", 10000));
        employees.add(new Employee(102, "Brian", 20000));
        employees.add(new Employee(103, "Charles", 30000));
        employees.add(new Employee(104, "David", 40000));
        employees.add(new Employee(105, "Edward", 50000));

        // Print salaries > 20000
        List<Integer> salaries = employees.stream()
                .filter(employee -> employee.salary > 20000)
                .map(employee -> employee.salary)
                .toList();
        salaries.forEach(System.out::println);
    }
}
