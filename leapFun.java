package full_TRAINING;

import java.util.*;

public class leapFun {
    static void leap(int x) {
        if ((x % 4 == 0) || (x % 100 == 0)) {
            System.out.println(x + " is " + "a leap year");

        } else {
            System.out.println("NOT LEAP");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int l = sc.nextInt();
        leap(l);
    }
}
