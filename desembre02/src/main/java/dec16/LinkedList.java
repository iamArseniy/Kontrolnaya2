package dec16;

public class LinkedList implements Queue{

    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
        for (int i = 1; i <= 10; i++) {
            add(i);
        }
    }

    public void add(int data){
        Node newnode = new Node(data);
        if (head==null) {
            head = newnode;
            tail = newnode;
            tail.next = head;
        }else{
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
        size++;
    }

    @Override
    public int next() {
        int value = head.value;
        head = head.next;
        tail = head;
        for (int i = 1; i < size; i++) {
            tail = tail.next;
        }
        return value;
    }


}
