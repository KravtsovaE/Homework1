public class Main {
    public static void main(String[] args) {
        within10and20(3, 4);
        isPositiveOrNegative(-7);
        isNegative(0);
        printWordNTimes("string1234", 5);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int m) {
        if (m >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void printWordNTimes(String s, int t) {
        for (int i = 0; i < t; i++) {
            System.out.println(s);
        }
    }
}