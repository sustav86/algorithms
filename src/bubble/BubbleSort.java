package bubble;

/**
 * @author Anton Sustavov
 * @since 2019/03/08
 */
public class BubbleSort {

    public void sort(int[] array) {
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i+1]) swap(array, i);
            }
        }
    }

    private void swap(int[] array, int i) {
        int temp = array[i+1];
        array[i+1] = array[i];
        array[i] = temp;
    }
}
