package insertion;

/**
 * @author Anton Sustavov
 * @since 2019/03/08
 */
public class InsertionSort {

    public void sort(int[] array) {
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int element = array[unsortedIndex];
            int i;
            for (i = unsortedIndex; i > 0 && array[i-1] > element; i--) {
                array[i] = array[i-1];
            }
            array[i] = element;
        }
    }

}
