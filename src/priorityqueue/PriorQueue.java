package priorityqueue;

import java.util.PriorityQueue;

public class PriorQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(2);
        pq.add(0);
        pq.add(-100);
        pq.add(435);

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
