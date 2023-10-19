package full_stack;

public class greatestamong3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 15;
        System.out.println(((a > b) && (a > c)) ? "A is greatest" : ((b > c) ? "B is greatest" : "C is greatest"));

    }

}
