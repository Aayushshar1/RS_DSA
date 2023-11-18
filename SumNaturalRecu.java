package full_TRAINING;

import java.util.Scanner;

public class SumNaturalno {
    static int s = 0;

    static void sumNatural(int n) {
        if (n == 0) {
            return;
        }
        s = s + n;
        sumNatural(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        sumNatural(n);
        System.out.println("SUM =" + s);

    }

}
