import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kdv1 = 18;
        double kdv2 = 8;
        double toplam = 0;
        double kdvToplam = 0;

        System.out.println("Tutar giriniz: ");
        double tutar = scanner.nextDouble();

        if (tutar < 500){
            System.out.println("KDV oranı : " + kdv1);
            kdvToplam = (tutar * kdv1) / 100;
            toplam = tutar + kdvToplam;
            System.out.println("KDV'li tutar: " + toplam);
        }else if (tutar >= 500) {
            System.out.println("KDV oranı : " + kdv2);
            kdvToplam = (tutar * kdv2) / 100;
            toplam = tutar + kdvToplam;
            System.out.println("KDV'li tutar: " + toplam);
        }
    }
}