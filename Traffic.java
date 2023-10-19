package full_stack;

import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter light colour");
        String str = sc.nextLine();

        switch (str) {
            case "red":
            case "green": {
                System.out.println("Next light will bne yellow");
                break;
            }
            case "yellow": {
                System.out.println("Next light will be red or yellow");
                break;
            }
            default: {
                System.out.println("Invalid color");
            }
        }
    }

}
