public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1 (from 0 to 10) ===");
        for (byte i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("=== Task 2 (from 10 to 0) ===");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("=== Task 3 (even from 0 to 17) ===");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("=== Task 4 (from 10 to -10) ===");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("=== Task 5 (leap years 1904-2096) ===");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("=== Task 6 (step of 7, from 7 to 98) ===");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("=== Task 7 (1 to 512 set, multiply by 2) ===");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("=== Task 8 (yearly savings by monthly deposits) ===");
        int influx = 29000;
        int savings = 0;

        for (int i = 0; i <= 12; i++) {
            savings = savings + influx;
            System.out.println("месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("=== Task 9 (yearly savings by monthly deposits with interest) ===");
        int deposit = 29000;
        int accountTotal = 0;
        float interestRatio = 1.1f;

        for (int i = 0; i <= 12; i++) {
            accountTotal = (int) ((accountTotal + deposit) * interestRatio);
            System.out.println("месяц " + i + ", сумма накоплений равна " + accountTotal + " рублей");
        }

        System.out.println("=== Task 10 (multiplication table) ===");
        int m = 2;              // multiplier
        int n = 10;             // number of operations

        for (int i = 1; i <= n; i++) {
            int r = i * m;      // result = number * multiplier
            System.out.println(m + " * " + i + " = " + r);
        }
    }
}