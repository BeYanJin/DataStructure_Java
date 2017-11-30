package heap;

import org.junit.Assert;
import org.junit.Test;

public class BinaryHeapTest {
    @Test
    public void testBinaryHeap() {
        Integer[] items = new Integer[]{150, 80, 40, 30, 10, 70, 110, 100, 20, 90, 60, 50, 120, 140, 130};

        BinaryHeap<Integer> binaryHeap = new BinaryHeap<Integer>(items);

        binaryHeap.print();

        binaryHeap.insert(5);
        Assert.assertEquals(5, (int)binaryHeap.findMin());

        binaryHeap.deleteMin();
        Assert.assertEquals(10, (int)binaryHeap.findMin());
    }
}
