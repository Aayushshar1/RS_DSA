package full_stack;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length");
        float l = sc.nextFloat();

        System.out.println("Enter Breath");

        float b = sc.nextFloat();

        System.out.println("area of rectangle=");
        System.out.println(l * b);
    }
}
