package hashtables;

import entity.Employee;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable(int capacity) {
        hashtable = new StoredEmployee[capacity];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);

        while (occupied(hashKey) && hashKey != hashtable.length - 1) {
            hashKey = (hashKey + 1) % hashtable.length;
            if (hashKey == hashtable.length - 1) hashKey = 0;
        }

        if (occupied(hashKey)) {
            System.out.println("Sorry, collision, on position " + hashKey);
        }else {
            hashtable[hashKey] = new StoredEmployee(key, employee);
        }
    }

    public StoredEmployee get(String key) {
        int hashKey = hashKey(key);

        return hashtable[findKey(key)];
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);

        while(!key.equals(hashtable[hashKey].key) && hashKey != hashtable.length - 1) {
            hashKey = (hashKey + 1) % hashtable.length;
            if (hashKey == hashtable.length - 1) hashKey = 0;
        }

        return hashKey;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
