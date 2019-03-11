package Logic;

public class List <T> {
    private Node head;
    private Node tail;
    private int length;

    public Node getHead() {
        return head;
    }

    public void List(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Add any kind of value to the list.
     */
    public void addLast(T value){
        length += 1;
        if (head == null){
            head = new Node(value);
            tail = new Node(value);
        } else {
            Node tmp = (Node) this.head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.next = new Node(value);
            tmp.next.prev = tmp;
            tail = tmp.getNext();

        }
    }

    /**
     * @return Visual String of the list.
     */
    public String printL(){
        Node tmp = head;
        String result = "[ ";
        while (tmp != null){
            if (tmp.getNext() != null){
                result += (tmp.getValue() + " , ");
            } else {
                result += tmp.getValue();
            }
            tmp = tmp.getNext();
        }
        result += " ]";
        return result;
    }
}
