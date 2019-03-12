package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSort {

    public void sort(int[] array, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        sort(array, start, mid);
        sort(array, mid, end);
        merge(array, start, mid, end);
    }

    private void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
}
