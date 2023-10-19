package full_stack;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print("Enter range");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println(n1 + " " + n2);

        for (i = 2; i < count; ++i)
            ;
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }
    }

}
