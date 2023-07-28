import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double boy, kilo, total;

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        total = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + total);
    }
}