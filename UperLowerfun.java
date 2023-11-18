package full_TRAINING;

import java.util.*;

public class UperLowerfun {
  public static void fun(String s) {
    char[] a = s.toCharArray();
    int l = a.length;
    String t = "";
    for (int i = 0; i < l; i++) {
      if (Character.isUpperCase(a[i])) {
        a[i] = Character.toLowerCase(a[i]);

      } else {
        a[i] = Character.toUpperCase(a[i]);

      }
    }
    for (int i = 0; i < l; i++) {
      t = t + a[i];
    }

    System.out.println("YOUR UPDATED STRING IS:" + t);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER STRING:");
    String x = sc.next();
    fun(x);

  }

}
