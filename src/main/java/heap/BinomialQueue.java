package heap;

public class BinomialQueue<T extends Comparable<? super T>> {
    private static final int DEFAULT_TREES = 1;

    private Node<T>[] theTrees;
    private int currentSize;

    public BinomialQueue() {

    }
    public BinomialQueue(T item) {

    }

    private static class Node<T> {
        T element;
        Node<T> leftChild;
        Node<T> nextSibling;

        Node(T theElement) {
            this(theElement, null, null);
        }
        Node(T theElement, Node<T> lt, Node<T> nt) {
            element = theElement;
            leftChild = lt;
            nextSibling = nt;
        }
    }

    public boolean isEmpty() {
    }
    public void makeEmpty() {
    }
    public void insert(T x) {
        merge(new BinomialQueue<T>(x));
    }
    public void merge(BinomialQueue<T> rhs) {
    }
    public T findMin() {
    }
    public T deleteMin() {
    }

    private void expandTheTrees(int newNumTrees) {
    }
    private Node<T> combineTrees(Node<T> t1, Node<T> t2) {
    }
    private int capacity() {
        return (1 << theTrees.length) - 1;
    }
    private int findMinIndex() {
    }
}
