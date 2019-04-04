package binarysearchtree;

import java.util.HashMap;
import java.util.Map;

public class MainBinarySearch {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(32);
        tree.insert(17);

//        tree.traverseInOrder();
        System.out.println(tree.get(29));
        System.out.println(tree.min());
        System.out.println(tree.max());
        tree.traverseInOrder();
        tree.delete(15);
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traversePreOrder();
    }
}
