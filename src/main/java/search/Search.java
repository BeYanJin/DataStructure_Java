package search;

public class Search {

    private static final int NOT_FOUND = -1;

    /**
     * 折半查找（默认升序） --- 时间复杂度：O(logN)
     * @param items 一个已升序排序的数组
     * @param item 欲查找的元素
     * @return 若找到欲查找的元素, 则返回其在数组中对应的下标; 找不到则返回 -1
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] items, T item) {
        int low = 0, high = items.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(items[mid].compareTo(item) < 0) {
                // 中间元素 小于 欲查找元素, 因为升序, 查找右半边
                low = mid + 1;
            } else if(items[mid].compareTo(item) > 0) {
                // 中间元素 大于 欲查找元素, 因为升序, 查找左半边
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return NOT_FOUND;
    }

    /**
     * 折半查找（降序） --- 时间复杂度：O(logN)
     * @param items 一个已降序排序的数组
     * @param item 欲查找的元素
     * @return 若找到欲查找的元素, 则返回其在数组中对应的下标; 找不到则返回 -1
     */
    public static <T extends Comparable<? super T>> int descBinarySearch(T[] items, T item) {
        int low = 0, high = items.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(items[mid].compareTo(item) < 0) {
                // 中间元素 小于 欲查找元素, 因为降序, 查找左半边
                high = mid - 1;
            } else if(items[mid].compareTo(item) > 0) {
                // 中间元素 大于 欲查找元素, 因为降序, 查找右半边
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return NOT_FOUND;
    }
}
