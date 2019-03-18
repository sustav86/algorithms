package singlelinkedlist;

import entity.Employee;

public class EmployeeSingleLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee, head);
        head = employeeNode;
        size++;
    }

    public void printList() {
        EmployeeNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getEmployee());
            currentNode = currentNode.getNext();
        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;

        EmployeeNode removeNode = head;
        head = head.getNext();
        removeNode.setNext(null);
        size--;

        return removeNode;
    }
}
