package full_stack;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SALARY");
        int n = sc.nextInt();
        if (n < 10000) {
            System.out.println("NO TAX");
        } else if (n > 10000 && n < 20000) {
            float t = ((n * 10) / 100);
            System.out.println("tax" + t);
        } else if (n > 20000 && n < 30000) {
            float t = ((n * 15) / 100);
            System.out.println("tax" + t);

        } else {
            float t = ((n * 25) / 100);
            System.out.println("tax" + t);
        }

    }

}
