public class Node <T> {
    private T value;
    private Node <T> next;
    private Node <T> prev;

    Node (T value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
