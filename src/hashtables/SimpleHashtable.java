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
        int hashKey = findKey(key);

        return hashKey != -1 ? hashtable[hashKey] : null;
    }

    public StoredEmployee remove(String key) {
        StoredEmployee findEmployee = null;
        int key1 = findKey(key);
        if (key1 != -1) {
            findEmployee = hashtable[key1];
            hashtable[key1] = null;
        }

        return findEmployee;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);
        int startKey = 0;

        while(!key.equals(hashtable[hashKey].key) && hashKey != (hashtable.length - 1) && startKey < 2) {
            hashKey = (hashKey + 1) % hashtable.length;
            if (hashKey == hashtable.length - 1) {
                hashKey = 0;
                startKey++;
            }
        }

        return key.equals(hashtable[hashKey].key) ? hashKey : -1;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
