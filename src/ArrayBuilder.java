import java.util.ArrayList;
import java.util.Random;

/**
 * @author Anton Sustavov
 * @since 2019/03/08
 */
public class ArrayBuilder {

    public static Random random = new Random();

    public static int[] createArray(int initialCapacity) {
        int[] array = new int[initialCapacity];
        for (int i = 0; i < initialCapacity; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
