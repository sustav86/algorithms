package hashtables;


import entity.Employee;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Anton Sustavov
 * @since 2019/03/21
 */
public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        hashtable[hashKey].add(new StoredEmployee(key, employee));
    }

    public StoredEmployee get(String key) {
        int hashKey = hashKey(key);
        Optional<StoredEmployee> employee = hashtable[hashKey].stream().filter(storedEmployee -> key.equals(storedEmployee.key)).findFirst();

        return employee.orElse(StoredEmployee.EMPTY_STOREDEMPLOYEE);
    }

    public StoredEmployee remove(String key) {
        int hashKey = hashKey(key);
        StoredEmployee removeEmployee = StoredEmployee.EMPTY_STOREDEMPLOYEE;
        Optional<StoredEmployee> employee = hashtable[hashKey].stream().filter(storedEmployee -> key.equals(storedEmployee.key)).findFirst();
        if (employee.isPresent()) {
            removeEmployee = employee.get();
            hashtable[hashKey].remove(removeEmployee);
        }
//        employee.ifPresent(storedEmployee -> hashtable[hashKey].remove(storedEmployee));

        return removeEmployee;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("Index: " + i);
            hashtable[i].stream().forEach(System.out::println);
        }
    }

    private int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }
}
