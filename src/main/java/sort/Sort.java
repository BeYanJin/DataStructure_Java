package sort;

public class Sort {
    
    /**
     * 插入排序（升序）
     * 平均运行时间：O(N^2)
     * 最坏情形运行时间：O(N^2)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void insertionAscSort(T[] a) {
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
     * 插入排序（降序）
     * 平均运行时间：O(N^2)
     * 最坏情形运行时间：O(N^2)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void insertionDescSort(T[] a) {
        int j;
        for(int p = 1; p < a.length; p++) {
            T tmp = a[p];
            for(j = p; j > 0 && tmp.compareTo(a[j-1]) > 0; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }



    /**
     * 希尔排序（升序）
     * 时间复杂度：采用不同的gap可能会有不同的时间复杂度
     * 最坏情形运行时间：O(N^2), 使用Hibbard增量的希尔排序的最坏情形运行时间为 O(N^(3/2))
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void shellAscSort(T[] a) {
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
    /**
     * 希尔排序（降序）
     * 时间复杂度：采用不同的gap可能会有不同的时间复杂度
     * 最坏情形运行时间：O(N^2), 使用Hibbard增量的希尔排序的最坏情形运行时间为 O(N^(3/2))
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void shellDescSort(T[] a) {
        int j;

        final int k = (int)(Math.log(a.length + 1) / Math.log(2));

        for(int gap = (int)Math.pow(2, k) - 1; gap > 0; gap = (gap - 1) / 2 ) {
            for(int i = gap; i < a.length; i++) {
                T tmp = a[i];
                for(j = i; j >= gap && tmp.compareTo(a[j-gap]) > 0; j -= gap) {
                    a[j] = a[j-gap];
                }
                a[j] = tmp;
            }
        }
    }



    /**
     * 堆排序（升序）
     * 平均运行时间：O(N logN)
     * 最坏情形运行时间：O(N logN)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void heapAscSort(T[] a) {
        for(int i = a.length / 2 - 1; i >= 0; i--) {    // buildHeap
            maxPercDown(a, i, a.length);
        }
        for(int i = a.length - 1; i > 0; i--) {
            swapReferences(a, 0, i);
            maxPercDown(a, 0, i);
        }
    }
    /**
     * 堆排序（降序）
     * 平均运行时间：O(N logN)
     * 最坏情形运行时间：O(N logN)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void heapDescSort(T[] a) {
        for(int i = a.length / 2 - 1; i >= 0; i--) {    // buildHeap
            minPercDown(a, i, a.length);
        }
        for(int i = a.length - 1; i > 0; i--) {
            swapReferences(a, 0, i);
            minPercDown(a, 0, i);
        }
    }


    /**
     * 归并排序（升序）
     * 平均运行时间：O(N logN)
     * 最坏情形运行时间：O(N logN)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void mergeAscSort(T[] a) {
        T[] tmpArray = (T[])new Comparable[ a.length ];

        mergeAscSort(a, tmpArray, 0, a.length - 1);
    }
    /**
     * 归并排序（降序）
     * 平均运行时间：O(N logN)
     * 最坏情形运行时间：O(N logN)
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void mergeDescSort(T[] a) {
        T[] tmpArray = (T[])new Comparable[ a.length ];

        mergeDescSort(a, tmpArray, 0, a.length - 1);
    }



    /**
     * 快速排序法
     * 时间复杂度：O(N logN)
     * 最坏情形运行时间：O(N^2), 经过稍许努力可使这种情形极难出现
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] a) {

    }



    /**
     * 交换数组中的元素
     * @param a 数组
     * @param index1 第一个要交换的元素的索引.
     * @param index2 第二个要交换的元素的索引.
     */
    public static <T> void swapReferences(T [ ] a, int index1, int index2 ) {
        T tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }



    /**
     * 堆排序的内部方法
     * @param i 元素的索引
     * @return 左儿子的索引
     */
    private static int leftChild(int i) {
        return 2 * i + 1;
    }
    /**
     * （最大元）堆排序的内部方法（用于 deleteMax 和 buildHeap）
     * @param a 数组
     * @param i 开始下滤的位置
     * @param n 堆的大小
     */
    private static <T extends Comparable<? super T>> void maxPercDown(T[] a, int i, int n) {
        int child;
        T tmp;
        for(tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);   // i是父元素索引, 2i+1是其左儿子的索引

            if(child != n -1 && a[child].compareTo( a[child + 1] ) < 0) {
                child++;    // 左儿子不是堆的最后一个元素, 且左儿子 < 右儿子, 则执行
            }
            if (tmp.compareTo(a[child]) < 0) {  // 父元素 < 儿子, 父元素下滤, 儿子上移
                a[i] = a[child];
            } else {
                break;
            }
        }
        a[i] = tmp;
    }
    /**
     * （最小元）堆排序的内部方法（用于 deleteMin 和 buildHeap）
     * @param a 数组
     * @param i 开始下滤的位置
     * @param n 堆的大小
     */
    private static <T extends Comparable<? super T>> void minPercDown(T[] a, int i, int n) {
        int child;
        T tmp;
        for(tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);   // i是父元素索引, 2i+1是其左儿子的索引

            if(child != n -1 && a[child].compareTo( a[child + 1] ) > 0) {
                child++;    // 左儿子不是堆的最后一个元素, 且左儿子 > 右儿子, 则执行
            }
            if (tmp.compareTo(a[child]) > 0) {  // 父元素 > 儿子, 父元素下滤, 儿子上移
                a[i] = a[child];
            } else {
                break;
            }
        }
        a[i] = tmp;
    }



    /**
     * 归并排序的内部递归方法（升序）
     * @param a 欲排序的数组
     * @param tmpArray 存放结果的数组
     * @param left 子序列的最左端索引
     * @param right 子序列的最右端索引
     */
    private static <T extends Comparable<? super T>>
    void mergeAscSort(T[] a, T[] tmpArray, int left, int right) {
        if(left < right) {
            int center = (left + right) / 2;
            mergeAscSort(a, tmpArray, left, center);
            mergeAscSort(a, tmpArray, center + 1, right);
            mergeAsc(a, tmpArray, left, center + 1, right);
        }
    }
    /**
     * 归并排序的内部递归方法（降序）
     * @param a 欲排序的数组
     * @param tmpArray 存放结果的数组
     * @param left 子序列的最左端索引
     * @param right 子序列的最右端索引
     */
    private static <T extends Comparable<? super T>>
    void mergeDescSort(T[] a, T[] tmpArray, int left, int right) {
        if(left < right) {
            int center = (left + right) / 2;
            mergeDescSort(a, tmpArray, left, center);
            mergeDescSort(a, tmpArray, center + 1, right);
            mergeDesc(a, tmpArray, left, center + 1, right);
        }
    }
    /**
     * 用于合并两个已排序序列的内部方法（升序）
     * @param a 欲排序的数组
     * @param tmpArray 存放结果的数组
     * @param leftPos 子序列的最左端索引
     * @param rightPos 第二个子序列的开始位置索引
     * @param rightEnd 子序列的最右端索引
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void mergeAsc( AnyType [ ] a, AnyType [ ] tmpArray, int leftPos, int rightPos, int rightEnd ) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while(leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos].compareTo(a[rightPos]) <= 0) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }

        while(leftPos <= leftEnd) {    // Copy rest of first half
            tmpArray[tmpPos++] = a[leftPos++];
        }

        while(rightPos <= rightEnd) {  // Copy rest of right half
            tmpArray[tmpPos++] = a[rightPos++];
        }

        // Copy tmpArray back
        for(int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }
    /**
     * 用于合并两个已排序序列的内部方法（降序）
     * @param a 欲排序的数组
     * @param tmpArray 存放结果的数组
     * @param leftPos 子序列的最左端索引
     * @param rightPos 第二个子序列的开始位置索引
     * @param rightEnd 子序列的最右端索引
     */
    private static <T extends Comparable<? super T>>
    void mergeDesc(T[] a, T[] tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while(leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos].compareTo(a[rightPos]) >= 0) {
                tmpArray[tmpPos++] = a[leftPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }

        while(leftPos <= leftEnd) {    // Copy rest of first half
            tmpArray[tmpPos++] = a[leftPos++];
        }

        while(rightPos <= rightEnd) {  // Copy rest of right half
            tmpArray[tmpPos++] = a[rightPos++];
        }

        // Copy tmpArray back
        for(int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }
}
