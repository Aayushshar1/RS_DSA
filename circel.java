package full_stack;

import java.util.Scanner;

public class circel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius");
        int r = sc.nextInt();
        System.out.println("area of circle is:");
        System.out.println(3.14 * r * r);
    }

}
