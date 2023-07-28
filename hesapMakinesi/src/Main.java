import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2;

        System.out.println("1.Sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();
        System.out.println("2.Sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Sonuç: " + (sayi1 / sayi2));
                break;
        }

    }
}