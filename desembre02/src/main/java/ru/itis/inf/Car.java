package ru.itis.inf;

public class Car {
    public static int MAX_SEATS = 5;
    private int takenSeats = 2;
    private boolean working = true;
    public Car(boolean working) {
        this.working = working;
    }
    public void setTakenSeats(int takenSeats) {
        this.takenSeats = takenSeats;
    }

    public int getTakenSeats() {return takenSeats;}


    public void review() throws BrokeCar {
        if (Math.random() < 0.6) {
            this.working = false;
            throw new BrokeCar();
        }
    }
}
