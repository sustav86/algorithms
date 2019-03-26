package search.binary;

public class MainBinary {

    public static void main(String[] args) {
        int[] array = {-45, 2, 8, 20, 34, 49};

//        System.out.println(findBinary(array,3));
//        System.out.println(findBinary(array,49));
        System.out.println(findBinaryRecursive(array, 0, array.length, 490));
    }

    private static int findBinaryRecursive(int[] array, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == value){
            return mid;
        }else if (array[mid] < value) {
            return findBinaryRecursive(array, mid + 1, end, value);
        }else {
            return findBinaryRecursive(array, start, mid, value);
        }
    }

    public static int findBinary(int[] array, int digit) {
        int star = 0;
        int end = array.length;

        while (star < end) {
            int mid = (star + end) / 2;
            if (array[mid] == digit)  {
                return mid;
            }else if (array[mid] < digit) {
                star = mid + 1;
            }else {
                end = mid;
            }
        }

        return -1;
    }
}
