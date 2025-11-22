
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz: ");
        double deg = input.nextDouble();

        int category;

        if (deg < 5) {
            category = 0;
        } else if (deg < 15) {
            category = 1;
        } else if (deg < 25) {
            category = 2;
        } else {
            category = 3;
        }

        switch (category) {
            case 0:
                System.out.println("Kayak icin harika bir gün!");
                break;
            case 1:
                System.out.println("Sinemaya ne dersin?");
                break;
            case 2:
                System.out.println("Piknige gitmek icin hava gayet hos!");
                break;
            case 3:
                System.out.println("Bence bugun yuzmeye gitmelisin");
                break;

        }
    }
}
