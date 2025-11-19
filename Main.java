import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matemik notunuz= ");
        int mat = input.nextInt();
        System.out.print("Fizik notunuz= ");
        int fiz = input.nextInt();
        System.out.print("Kimya notunuz= ");
        int kim = input.nextInt();
        System.out.print("Turkce notunuz= ");
        int turk = input.nextInt();
        System.out.print("Tarih notunuz= ");
        int tar = input.nextInt();
        System.out.print("Muzik notunuz= ");
        int muz = input.nextInt();

        double ortalama = (mat + fiz + kim + turk + tar + muz) / 6.0;
        System.out.println("Ortalamaniz= " + ortalama);

        boolean gecmek = ortalama >= 60;
        String str = gecmek ? "Gectiniz." : "Kaldiniz.";
        System.out.println("Sinifi gecme durumunuz= " + str);
    }
}
