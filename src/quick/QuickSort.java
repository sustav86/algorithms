package quick;

public class QuickSort {

    public void sort(int[] array, int start, int end) {

        if (end - start < 2) return;

        int pivotIndex = position(array, start, end);
        sort(array, start, pivotIndex);
        sort(array, pivotIndex + 1, end);
    }

    private int position(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && array[--j] >= pivot ) {
                if (i < j) {
                    array[i] = array[j];
                }
            }
            while (i < j && array[++i] <= pivot ) {
                if (i < j) {
                    array[j] = array[i];
                }
            }
        }

        array[j] = pivot;

        return j;
    }
}
