package streams.filterMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMapDemo {
    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "karthik", 50000),
                new Employee(2, "yogesh", 45000),
                new Employee(3, "suresh", 60000),
                new Employee(4, "sarvajith", 49000));
        List<Integer> employeeSalary = employeeList.stream()
                .filter(e -> e.salary > 550000)
                .map(e -> e.salary).toList();
        System.out.println(employeeSalary);


    }
}
class Employee{
    int empId;
    String empName;
    int salary;

    Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

}
