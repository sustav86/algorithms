package radix;

/**
 * @author Anton Sustavov
 * @since 2019/03/14
 */
public class RadixSort {

    public void sort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }

    }

    private void radixSingleSort(int[] array, int position, int radix) {

        int numItems = array.length;
        int[] countArray = new int[radix];

        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            array[tempIndex] = temp[tempIndex];
        }

    }

    private int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

}
