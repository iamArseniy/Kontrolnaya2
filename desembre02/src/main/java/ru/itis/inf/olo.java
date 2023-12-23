package ru.itis.inf;

public class olo {
    public static void newArray(int [] a) {
        int [] b = new int[]{1,2,3};
        a = b;
    }
    public static void main(String[] args) {
        int [] z = new int[]{1,1,1};
        newArray(z);
// z[2] = ?
        System.out.println(z[2]);
    }
}
