
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 4 == 0) {

                sum += i;
                counter++;

            }

        }
        if (counter == 0) {
            System.out.println("3 ve 4'e bölünen hicbir sayi yoktur.");
        } else {
            double average = (double) sum / counter;
            System.out.println("Ortalama: " + average);

        }
    }
}
