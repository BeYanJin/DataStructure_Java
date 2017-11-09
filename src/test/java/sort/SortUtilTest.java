package sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sort.SortUtil;

public class SortUtilTest {
    @Test
    public void testInsertionSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] result = new Integer[]{8, 21, 32, 34, 51, 64};
        SortUtil.insertionSort(array);
        Assert.assertArrayEquals(result, array);
    }

    @Test
    public void testShellSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] result = new Integer[]{8, 21, 32, 34, 51, 64};
        SortUtil.shellSort(array);
        Assert.assertArrayEquals(result, array);
    }
}
