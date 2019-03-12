package selection;

/**
 * @author Anton Sustavov
 * @since 2019/03/08
 */
public class SelectionSort {

    public void sort(int[] array) {
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastIndex; i++) {
                if (array[i] > array[largest]) largest = i;
            }
            swap(array, largest, lastIndex);
        }
    }

    private void swap(int[] array, int largest, int lastIndex) {
        if (largest == lastIndex) return;
        int temp = array[lastIndex];
        array[lastIndex] = array[largest];
        array[largest] = temp;
    }
}
