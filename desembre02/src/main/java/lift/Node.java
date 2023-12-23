package lift;

public class Node {
    public int value;
    public boolean state;

    public Node next;

    public Node(int value, boolean state){
        this.value = value;
        this.next = null;
        this.state = state;
    }


}
