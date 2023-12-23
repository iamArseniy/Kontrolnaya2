package lift;

abstract class Elevator {
    int capacity;
    int tonnage;

    Status status;

    public Elevator(int c, int t, Status st){
        this .capacity = c;
        this.tonnage = t;
        this.status = st;
    }

}
