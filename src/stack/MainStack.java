package stack;

import entity.Employee;

public class MainStack {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(2);
        arrayStack.push(new Employee(1, "First", "LastName"));
        arrayStack.push(new Employee(2, "Second", "LastName"));
        arrayStack.push(new Employee(3, "Third", "LastName"));

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pick());

        arrayStack.printStack();
    }
}
