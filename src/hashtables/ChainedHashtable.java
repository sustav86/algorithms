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

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
