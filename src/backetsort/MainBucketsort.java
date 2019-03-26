package backetsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBucketsort {

    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketsort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void bucketsort(int[] intArray) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < intArray.length; i++) {
            buckets[hash(intArray[i])].add(intArray[i]);
        }

        for (List<Integer> bucket :
                buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int sum :
                    buckets[i]) {
                intArray[j++] = sum;
            }

        }
    }

    public static int hash(int index) {
        return index / 10;
    }
}
