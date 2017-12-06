package sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void testInsertionSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] ascResult = new Integer[]{8, 21, 32, 34, 51, 64};
        Integer[] descResult = new Integer[]{64, 51, 34, 32, 21, 8};

        Sort.insertionAscSort(array);
        Assert.assertArrayEquals(ascResult, array);

        Sort.insertionDescSort(array);
        Assert.assertArrayEquals(descResult, array);
    }

    @Test
    public void testShellSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] ascResult = new Integer[]{8, 21, 32, 34, 51, 64};
        Integer[] descResult = new Integer[]{64, 51, 34, 32, 21, 8};

        Sort.shellAscSort(array);
        Assert.assertArrayEquals(ascResult, array);

        Sort.shellDescSort(array);
        Assert.assertArrayEquals(descResult, array);
    }

    @Test
    public void testHeapSort() {
        Integer[] array = new Integer[]{34, 8, 64, 51 ,32 ,21};
        Integer[] ascResult = new Integer[]{8, 21, 32, 34, 51, 64};
        Integer[] descResult = new Integer[]{64, 51, 34, 32, 21, 8};

        Sort.heapAscSort(array);
        Assert.assertArrayEquals(ascResult, array);

        Sort.heapDescSort(array);
        Assert.assertArrayEquals(descResult, array);
    }

    @Test
    public void testMergeSort() {
        Integer[] array = new Integer[]{9, 1, 5, 3, 4, 2, 6, 8, 7};
        Integer[] ascResult = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] descResult = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        Sort.mergeAscSort(array);
        Assert.assertArrayEquals(ascResult, array);

        Sort.mergeDescSort(array);
        Assert.assertArrayEquals(descResult, array);
    }
}
