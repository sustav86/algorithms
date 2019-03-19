package doublelinkedlist;

import entity.Employee;

public class EmployeeDoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);

        if (head == null) {
            tail = employeeNode;
        }else {
            head.setPrevious(employeeNode);
        }

        head = employeeNode;
        size++;
    }

    public void addToTail(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setPrevious(tail);
        tail.setNext(employeeNode);
        tail = employeeNode;
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

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) return null;

        EmployeeNode removeNode = tail;
        tail = tail.getPrevious();
        tail.setNext(null);

        return removeNode;
    }
}
