package arraylists;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "FirstName", "LastName"));
        employees.add(new Employee(2, "FirstName", "LastName"));
        employees.add(new Employee(3, "FirstName", "LastName"));
        employees.add(new Employee(4, "FirstName", "LastName"));
        employees.add(new Employee(5, "FirstName", "LastName"));
    }
}
