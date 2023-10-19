package full_stack;

import java.util.Scanner;

public class variableswap {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);

    }
}
