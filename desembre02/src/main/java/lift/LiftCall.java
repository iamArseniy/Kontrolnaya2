package lift;

import dec9.InputError;

public class LiftCall implements  Call{
    Passenger type;


    public LiftCall(Passenger p){
        this.type = p;
    }

    @Override
    public void call(Elevatorimpl elevatorsystem) {
        try {
            if (elevatorsystem.elevator_free() != null) {
                int numb = elevatorsystem.elevator_free().value;
                elevatorsystem.elevator_free().state = false;
                System.out.println("Вы вызвали лифт типа " + type + ", Номер лифта который приедет-" + numb);
            } else {
                throw new BusyError();
            }
        } catch (BusyError e) {
            System.out.println("Подходящие лифты заняты. Идите пешком");
        }


    }


}
