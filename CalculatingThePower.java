
import java.util.Scanner;

public class NewClass3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        for (int i = 0; i <= sayi; i++) {
            int islem = (int) Math.pow(4, i);
            System.out.println("4'un " + i + ". kuvveti = " + islem);
            int islem2 = (int) Math.pow(5, i);
            System.out.println("5'in " + i + ". kuvveti = " + islem2);
        }

    }
}
