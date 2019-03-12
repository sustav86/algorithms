package shell;

/**
 * @author Anton Sustavov
 * @since 2019/03/09
 */
public class ShellSort {

    public void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int element = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > element) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = element;

            }
        }
    }
}
