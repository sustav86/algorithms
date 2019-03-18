package singlelinkedlist;

import entity.Employee;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    @java.beans.ConstructorProperties({"employee", "next"})
    public EmployeeNode(Employee employee, EmployeeNode next) {
        this.employee = employee;
        this.next = next;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public EmployeeNode getNext() {
        return this.next;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
}
