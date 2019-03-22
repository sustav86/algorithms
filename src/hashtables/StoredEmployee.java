package hashtables;

import entity.Employee;

public class StoredEmployee {

    public static final StoredEmployee EMPTY_STOREDEMPLOYEE = new StoredEmployee();
    public String key;
    public Employee employee;

    public StoredEmployee() {
    }

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "StoredEmployee{" +
                "key='" + key + '\'' +
                ", employee=" + employee +
                '}';
    }
}
