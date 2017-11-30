package sort;

public class Sort {
    
    /**
     * 插入排序
     * 时间复杂度：O(N^2)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        int j;
        for(int p = 1; p < a.length; p++) {
            T tmp = a[p];
            for(j = p; j > 0 && tmp.compareTo(a[j-1]) < 0; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    /**
     * 希尔排序
     * 时间复杂度：使用Hibbard增量的希尔排序的最坏情形运行时间
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void shellSort(T[] a) {
        int j;

        final int k = (int)(Math.log(a.length + 1) / Math.log(2));

        for(int gap = (int)Math.pow(2, k) - 1; gap > 0; gap = (gap - 1) / 2 ) {
            for(int i = gap; i < a.length; i++) {
                T tmp = a[i];
                for(j = i; j >= gap && tmp.compareTo(a[j-gap]) < 0; j -= gap) {
                    a[j] = a[j-gap];
                }
                a[j] = tmp;
            }
        }
    }
}
