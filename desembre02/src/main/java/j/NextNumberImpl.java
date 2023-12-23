package j;

public class NextNumberImpl implements  NextNumber{
    private Node current;
    public NextNumberImpl(){
        Node root = new Node(1);
        current= root;
        for (int i=2; i<=10; ++i){
            current.next =new Node(i);
            current = current.next;
        }
        current.next = root;
    }

    @Override
    public int next(){
        int result = current.value;
        current = current.next;
        return result;

    }
}
