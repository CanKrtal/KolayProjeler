import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acilisUcret = 10;
        double yol;

        System.out.println("Kaç kilometre yol gideceksiniz: ");
        yol = scanner.nextDouble();

        double total = acilisUcret + (yol * 2.20);

        if (total > 20){
            System.out.println("Toplam tutar: " + total);
        }else {
            System.out.println("Toplam tutar: 20TL");
        }
    }
}