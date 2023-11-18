package full_TRAINING;

import java.util.*;

public class Swapfun {
  public static void swap(int a, int b) {
    System.out.println("variables before swapping");
    System.out.println("X = " + a);
    System.out.println("Y = " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("variables after swapping");
    System.out.println("X = " + a);
    System.out.println("Y = " + b);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER 2 INT NO.:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    swap(x, y);

  }
}
