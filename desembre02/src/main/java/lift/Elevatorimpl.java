package lift;

public class Elevatorimpl implements Lift{
    private Node current;
    private int number;

    public Elevatorimpl(int n){
        this.number = n;
        Node root = new Node(1,true);
        current = root;
        if (n==1){
            current.next = root;
        }else{
            for (int i=2; i<=n; i++){
                Node nd = new Node(i,true);
                current.next = nd;
                current = current.next;
            }
            current.next = root;
        }


    }

    @Override
    public Node elevator_free(){
        for (int i=1; i<=number;i++){
            boolean result = current.state;
            if (result==true){return current;}
            current = current.next;
        }

        return null;
    }

    public void busynow(){
        for (int i=1; i<=number;i++){
            boolean result = current.state;
            if (result==true){
                current.state = false;
                break;
            }
            current = current.next;
        }
    }



}
