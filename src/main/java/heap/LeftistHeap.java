package heap;

public class LeftistHeap<T extends Comparable<? super T>> {
    // 根节点
    private Node<T> root;

    // 节点内部类
    private static class Node<T> {
        // 构造器
        Node(T theElement) {
            this(theElement, null, null);
        }
        Node(T theElement, Node<T> lt, Node<T> rt) {
            element = theElement;
            left = lt;
            right = rt;
            npl = 0;
        }

        // 节点元素
        T element;
        // 左节点
        Node<T> left;
        // 右节点
        Node<T> right;
        // 零路径长
        int npl;
    }

    // 构造左式堆
    public LeftistHeap() {
        root = null;
    }

    /**
     * 合并两个堆
     */
    public void merge(LeftistHeap<T> rhs) {

    }
    /**
     * 插入一个新元素
     */
    public void insert(T x) {

    }
    /**
     * 寻找最小元
     */
    public T findMin() {
        return root.element;
    }
    /**
     * 从堆中删除最小元
     */
    public T deleteMin() {
        return root.element;
    }
    /**
     * 判断堆是否为空
     */
    public boolean isEmpty() {
        return root == null;
    }
    /**
     * 清空堆
     */
    public void makeEmpty() {
        root = null;
    }

    private Node<T> merge(Node<T> h1, Node<T> h2) {
        return root;
    }
    private Node<T> merge1(Node<T> h1, Node<T> h2) {
        return root;
    }
    private void swapChildren(Node<T> t) {

    }
}
