package sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void testInsertionSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] result = new Integer[]{8, 21, 32, 34, 51, 64};
        Sort.insertionSort(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void testShellSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] result = new Integer[]{8, 21, 32, 34, 51, 64};
        Sort.shellSort(array);
        Assert.assertArrayEquals(result, array);
    }
}
