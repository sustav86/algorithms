package hashtables;

import entity.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

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
