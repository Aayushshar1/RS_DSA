package full_stack;

import java.util.Scanner;

public class Pattern3traiangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
