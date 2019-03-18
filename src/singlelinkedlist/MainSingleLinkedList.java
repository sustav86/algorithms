package singlelinkedlist;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainSingleLinkedList {

    public static void main(String[] args) {

        EmployeeSingleLinkedList employees = new EmployeeSingleLinkedList();
        employees.addToFront(new Employee(1, "FirstName", "LastName"));
        employees.addToFront(new Employee(2, "FirstName", "LastName"));
        employees.addToFront(new Employee(3, "FirstName", "LastName"));
        employees.addToFront(new Employee(4, "FirstName", "LastName"));
        employees.addToFront(new Employee(5, "FirstName", "LastName"));

        employees.printList();

        employees.removeFromFront();
        System.out.println("After remove:");
        employees.printList();
    }
}
