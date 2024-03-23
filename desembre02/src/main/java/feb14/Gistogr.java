package feb14;

import java.util.Scanner;
import java.util.Arrays;

//Twas brillig, and the slithy toves Did gyre and gimble in the wabe;All mimsy were the borogoves, And the mome raths outgrabe.
public class Gistogr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ind = 0;
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (!cont(newS, s.charAt(i)) && s.charAt(i) != ' ') {
                newS = newS + s.charAt(i);
            }//n^2
        }
        char[] charArray = newS.toCharArray();
        Arrays.sort(charArray);
        int[] counts = new int[newS.length()];
        int maxc = -100;
        newS = new String(charArray);
        for (int i = 0; i < newS.length(); i++) {
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (newS.charAt(i) == s.charAt(j)) {
                    c++;
                }
            }
            if (maxc < c) {
                maxc = c;
            }
            counts[i] = c;
        }//n^2
        for (int i = maxc; i > 0; i--) {
            for (int j = 0; j < newS.length(); j++) {
                if (maxc == counts[j]) {
                    System.out.print("#");
                    counts[j] = counts[j] - 1;
                } else {
                    System.out.print(" ");
                }
            }
            maxc--;
            System.out.println();
        }

        System.out.println(newS);


    }

    public static boolean cont(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}
