package hashtables;

import entity.Employee;

public class MainHashtable {

    public static void main(String[] args) {
        Employee david = new Employee(1, "David", "Getto");
        Employee mark = new Employee(2, "Makr", "Getto");
        Employee elis = new Employee(3, "Elis", "Getto");
        Employee frank = new Employee(4, "Frank", "Getto");
        Employee mira = new Employee(5, "Mira", "Getto");
        Employee esquaer = new Employee(6, "Esquaer", "Getto");

//        SimpleHashtable simpleHashtable = new SimpleHashtable(7);
//        simpleHashtable.put(david.getFirstName(), david);
//        simpleHashtable.put(elis.getFirstName(), elis);
//        simpleHashtable.put(frank.getFirstName(), frank);
//        simpleHashtable.put(mark.getFirstName(), mark);
//        simpleHashtable.put(mira.getFirstName(), mira);
//        simpleHashtable.put(esquaer.getFirstName(), esquaer);
//
//        simpleHashtable.print();
//        System.out.println("Find Makr");
//        System.out.println(simpleHashtable.get("Makr"));
//        System.out.println("Remove Elis");
//        simpleHashtable.remove("Elis");
//        simpleHashtable.print();

        ChainedHashtable chainedHashtable = new ChainedHashtable();
        chainedHashtable.put("david", david);
        System.out.println(chainedHashtable.get("davide"));
    }
}
