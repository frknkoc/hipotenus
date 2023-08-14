import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Kenar1, Kenar2;
        double Kenar3;
        System.out.println("Lütfen BİRİNCİ kenar uzunluğunu giriniz...");
        Scanner kenar1 = new Scanner(System.in);
        Kenar1 = kenar1.nextInt();

        System.out.println("Lütfen İKİNCİ kenar uzunluğunu giriniz...");
        Scanner kenar2 = new Scanner(System.in);
        Kenar2 = kenar2.nextInt();

        Kenar3 = Math.sqrt((Kenar1 * Kenar1) + (Kenar2 * Kenar2));
        System.out.println("Hipotenüs :" + Kenar3);
    }
}