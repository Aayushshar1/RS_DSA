package full_stack;

import java.util.Scanner;

public class tempconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature");
        float n = sc.nextFloat();
        System.out.println("enter choice");
        System.out.println("press 1 for temperature in celsius");
        System.out.println("press 2 for temperature in Fahrenhiet");
        int a = sc.nextInt();
        if (a == 1) {
            float c = ((n - 32) * (5 / 9));
            System.out.println(c);
        } else {
            float f = ((n * (9 / 5)) + 32);
            System.out.println(f);
        }

    }

}
