package doublelinkedlist;


import entity.Employee;

public class MainDoubleLinkedList {

    public static void main(String[] args) {

        EmployeeDoubleLinkedList employees = new EmployeeDoubleLinkedList();
        employees.addToFront(new Employee(1, "FirstName", "LastName"));
        employees.addToFront(new Employee(2, "FirstName", "LastName"));
        employees.addToFront(new Employee(3, "FirstName", "LastName"));
//        employees.addToFront(new Employee(4, "FirstName", "LastName"));
//        employees.addToFront(new Employee(5, "FirstName", "LastName"));

        employees.printList();

        employees.removeFromFront();
        System.out.println("After remove:");
        employees.printList();
        employees.addToTail(new Employee(23, "DDD", "FFF"));
        System.out.println("ADD tail");
        employees.printList();
        System.out.println("Remove from END");
        employees.removeFromEnd();
        employees.printList();

    }
}
