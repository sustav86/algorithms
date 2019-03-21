package hashtables;

import entity.Employee;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable(int capacity) {
        hashtable = new Employee[capacity];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        if (hashtable[hashKey] != null) {
            System.out.println("Sorry, collision, on position " + hashKey);
        }else {
            hashtable[hashKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);

        return hashtable[hashKey];
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
