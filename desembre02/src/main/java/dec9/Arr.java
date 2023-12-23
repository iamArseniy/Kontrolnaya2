package dec9;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        int[] array = {5, 16,17,80,100, 101, 102,105,110};
        int typedNumber = -1;
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        while (typedNumber == -1) {
            try {
                if (!(scan.hasNextInt()) || scan.nextInt() <= 0 ) {
                    scan.next();
                    throw new InputError();
                }else{
                    typedNumber = scan.nextInt();
                }
            } catch (InputError e){
                System.out.println("Неправильный ввод");
            }
        }
        int index = 0;
        while (array[index] < typedNumber){
            index += 1;
        }
        if (index == 0) System.out.println("Не найдено");
        else System.out.println(array[index-1]);
    }
}

