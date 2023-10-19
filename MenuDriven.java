package full_stack;

import java.util.*;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1st number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            System.out.println("press 1 for multiplication");
            System.out.println("press 2 for Addition");
            System.out.println("press 3 for Substraction");
            System.out.println("press 4 for Division");

            int n = sc.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("multiplication :" + a * b);
                    break;
                }
                case 2: {
                    System.out.println("Addition :" + (a + b));
                    break;
                }
                case 3: {
                    System.out.println("Substraction :" + (a - b));
                    break;
                }
                case 4: {
                    System.out.println("Division :" + (a / b));
                    break;
                }
                default: {
                    System.out.println("Invalid option :");
                }

            }
            System.out.println("Press 1 for exit otherwise press any one ");
            int q = sc.nextInt();
            if (q == 1) {
                System.exit(0);
            } else {
                System.out.println("invalid choice");
            }

        }

    }

}
