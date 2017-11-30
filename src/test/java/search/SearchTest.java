package search;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {
    @Test
    public void testSearch() {
        Integer[] items1 = new Integer[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        Integer[] items2 = new Integer[]{512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        Assert.assertEquals(1, Search.binarySearch(items1, 2));
        Assert.assertEquals(2, Search.descBinarySearch(items2, 128));
    }
}
