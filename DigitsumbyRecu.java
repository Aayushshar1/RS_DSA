package full_TRAINING;

import java.util.Scanner;

public class DigitsumbyRecu {

    static int s = 0;

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int r = n % 10;
        s = s + r;
        sum(n / 10);
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r = sum(n);
        System.out.println("sum is" + r);

    }

}
