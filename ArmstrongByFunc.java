package full_stack;

import java.util.*;

public class ArmstrongByFunc {
    static int findlength(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count += 1;
        }
        return (count);
    }

    static int findpower(int base, int exp) {
        int result = 1;
        int power = exp;
        while (power != 0) {
            result = result * base;
            power--;
        }
        return (result);
    }

    static void isArmstrong(int num){
        int numcopy=num;
        int numberlenght=findlenght(numcopy);
        int s=num%10 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

    }
}
