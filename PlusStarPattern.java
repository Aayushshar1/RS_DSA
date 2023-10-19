package full_stack;

import java.util.*;

public class PlusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == (n + 1) / 2) || (j == (n + 1) / 2)) {
                    System.out.print("&");
                } else {
                    System.out.print(" ");
                }2
            }
            System.out.println();
        }

    }

}
