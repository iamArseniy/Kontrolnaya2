package ru.itis.inf;


public class Expedition {
   public static void main(String[] args){
      int distance = 100;
      int pobeda = 0;
      for (int t =0; t<1000;t++) {
         Car[] cars = new Car[10];
         for (int i = 0; i < 10; i++) {
            cars[i] = new Car(true);
         }
         int carscount = 10;
         for (int i = 0; i < distance / 100; i++) {
            for (int k = 0; k < cars.length; k++) {
               try {
                  cars[k].review();
               } catch (BrokeCar e) {
                  System.out.println("Машина сломалась!");
                  carscount = carscount - 1;
               }
            }
         }
         if (carscount >= 4) {
            pobeda += 1;
         }
      }
      System.out.println((double)pobeda/1000);
   }
}


