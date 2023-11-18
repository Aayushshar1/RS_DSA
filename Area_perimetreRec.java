package full_TRAINING;

import java.util.*;

public class Area_perimetreRec {
    static void area(int x, int y) {
        System.out.println("AREA = " + (x * y));
        return;
    }

    static void perimetre(int x, int y) {
        System.out.println("PERIMETRE = " + 2 * (x + y));
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGHTH:");
        int a = sc.nextInt();
        System.out.println("ENTER BREADTH:");
        int b = sc.nextInt();
        area(a, b);
        perimetre(a, b);
    }
}
