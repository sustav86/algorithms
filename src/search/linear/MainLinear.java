package search.linear;

public class MainLinear {

    public static void main(String[] args) {
        int[] array = {2, 34, -45, 8, 20, 49};

        System.out.println(find(array,3));
        System.out.println(find(array,49));
    }

    public static int find(int[] array, int digit) {
        for (int i = 0; i < array.length; i++) {
            if (digit == array[i]) return i;
        }

        return -1;
    }
}
