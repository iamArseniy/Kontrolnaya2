package lift;

public class Main {
    public static void main(String[] args) {

        Elevatorimpl evenelsystem = new Elevatorimpl(3);
        Elevatorimpl oddelsystem = new Elevatorimpl(3);
        Elevatorimpl staffelsystem = new Elevatorimpl(1);

        EvenLift el1 = new EvenLift(10,800, Status.FREE);
        EvenLift el2 = new EvenLift(11,900, Status.FREE);
        EvenLift el3 = new EvenLift(5,400, Status.FREE);
        OddLift ol1 = new OddLift(10,800, Status.BUSY);
        OddLift ol2 = new OddLift(9,700, Status.FREE);
        OddLift ol3 = new OddLift(15,1200, Status.FREE);
        StaffLift sl = new StaffLift(4, 320, Status.FREE);

 // убираем в системе категории лифтов неработающий лифт
        oddelsystem.busynow();


        LiftCall lc1 = new LiftCall(Passenger.EVEN);
        lc1.call(evenelsystem);
        LiftCall lc2 = new LiftCall(Passenger.EVEN);
        lc2.call(evenelsystem);
        LiftCall lc3 = new LiftCall(Passenger.EVEN);
        lc3.call(evenelsystem);
        LiftCall lc4 = new LiftCall(Passenger.EVEN);
        lc4.call(evenelsystem);
        LiftCall lc14 = new LiftCall(Passenger.EVEN);
        lc14.call(evenelsystem);
        LiftCall lc15 = new LiftCall(Passenger.EVEN);
        lc15.call(evenelsystem);
        LiftCall lc16 = new LiftCall(Passenger.EVEN);
        lc16.call(evenelsystem);

        LiftCall lc5 = new LiftCall(Passenger.ODD);
        lc5.call(oddelsystem);
        LiftCall lc6 = new LiftCall(Passenger.ODD);
        lc6.call(oddelsystem);
        LiftCall lc7 = new LiftCall(Passenger.ODD);
        lc7.call(oddelsystem);
        LiftCall lc8 = new LiftCall(Passenger.ODD);
        lc8.call(oddelsystem);
        LiftCall lc9 = new LiftCall(Passenger.ODD);
        lc9.call(oddelsystem);
        LiftCall lc10 = new LiftCall(Passenger.ODD);
        lc10.call(oddelsystem);
        LiftCall lc11 = new LiftCall(Passenger.ODD);
        lc11.call(oddelsystem);
        LiftCall lc12 = new LiftCall(Passenger.ODD);
        lc12.call(oddelsystem);
        LiftCall lc13 = new LiftCall(Passenger.ODD);
        lc13.call(oddelsystem);

        LiftCall lc17  = new LiftCall(Passenger.STAFF);
        lc17.call(staffelsystem);
        LiftCall lc18  = new LiftCall(Passenger.STAFF);
        lc18.call(staffelsystem);
        LiftCall lc19  = new LiftCall(Passenger.STAFF);
        lc19.call(staffelsystem);
        LiftCall lc20  = new LiftCall(Passenger.STAFF);
        lc20.call(staffelsystem);





    }
}
