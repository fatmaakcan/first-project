
import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n (total number of elements): ");
        int n = input.nextInt();
        System.out.print("Enter r (number of chosen elements): ");
        int r = input.nextInt();

        long result1 = 1;
        for (int i = 1; i <= n; i++) {
            result1 *= i;
        }

        long result2 = 1;

        for (int i = 1; i <= r; i++) {
            result2 *= i;
        }

        long result3 = 1;

        for (int i = 1; i <= (n - r); i++) {
            result3 *= i;
        }

        long combination = result1 / (result2 * result3);
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
