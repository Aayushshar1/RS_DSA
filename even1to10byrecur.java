package full_TRAINING;

public class even1to10byrecur {
    static void rec(int n) {
        if (n == 0) {
            return;
        }
        rec(n - 1);
        if (n % 2 == 0) {
            System.out.println(n + "is even");
        }
    }

    public static void main(String[] args) {
        rec(10);

    }

}
