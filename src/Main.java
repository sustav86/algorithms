import bubble.BubbleSort;
import counting.CountingSort;
import insertion.InsertionSort;
import merge.MergeSort;
import quick.QuickSort;
import radix.RadixSort;
import recursion.Factorial;
import selection.SelectionSort;
import shell.ShellSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

//        System.out.println("Bubble sort:");
//        int[] bubbleArray = ArrayBuilder.createArray(20);
//        System.out.println("Start array: " + Arrays.toString(bubbleArray));
//        new BubbleSort().sort(bubbleArray);
//        System.out.println("Sort array: " + Arrays.toString(bubbleArray));
//
//        System.out.println("Selection sort:");
//        int[] selectionArray = ArrayBuilder.createArray(30);
//        System.out.println("Start array: " + Arrays.toString(selectionArray));
//        new SelectionSort().sort(selectionArray);
//        System.out.println("Sort array: " + Arrays.toString(selectionArray));
//
//        System.out.println("Insertion sort:");
//        int[] insertionArray = ArrayBuilder.createArray(25);
//        System.out.println("Start array: " + Arrays.toString(insertionArray));
//        new InsertionSort().sort(insertionArray);
//        System.out.println("Sort array: " + Arrays.toString(insertionArray));
//
//        System.out.println("Shell sort:");
//        int[] shellArray = ArrayBuilder.createArray(25);
//        System.out.println("Start array: " + Arrays.toString(shellArray));
//        new ShellSort().sort(shellArray);
//        System.out.println("Sort array: " + Arrays.toString(shellArray));
//
//        int i = ArrayBuilder.random.nextInt(10);
//        int i1 = Factorial.iterativeFactorial(i);
//        System.out.println("Factorial of: " + i + ", is: " + i1);
//
//        int numFactorial = ArrayBuilder.random.nextInt(10);
//        int factorial = Factorial.iterativeFactorial(numFactorial);
//        System.out.println("Recursion factorial of: " + numFactorial + ", is: " + factorial);

//        System.out.println("Merge sort:");
//        int[] mergeArray = ArrayBuilder.createArray(7);
//        System.out.println("Merge array: " + Arrays.toString(mergeArray));
//        new MergeSort().sort(mergeArray, 0, mergeArray.length);
//        System.out.println("Merge array: " + Arrays.toString(mergeArray));
//
//        System.out.println("Quick sort:");
//        int[] quickArray = ArrayBuilder.createArray(7);
//        System.out.println("Quick array: " + Arrays.toString(quickArray));
//        new QuickSort().sort(quickArray, 0, quickArray.length);
//        System.out.println("Quick array: " + Arrays.toString(quickArray));

//        System.out.println("Counting sort:");
//        int[] countingArray = ArrayBuilder.createArray(7);
//        System.out.println("Counting array: " + Arrays.toString(countingArray));
//        new CountingSort().sort(countingArray, 0, 100);
//        System.out.println("Counting array: " + Arrays.toString(countingArray));

        System.out.println("Radix sort:");
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        System.out.println("Radix array: " + Arrays.toString(radixArray));
        new RadixSort().sort(radixArray, 10, 4);
        System.out.println("Radix array: " + Arrays.toString(radixArray));
    }
}
