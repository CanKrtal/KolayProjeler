import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fizik, matematik, turkce, kimya, muzik, tarih;
        double total = 0;

        System.out.println("Fizik notunuz: ");
        fizik = scanner.nextInt();
        System.out.println("Matematik notunuz: ");
        matematik = scanner.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = scanner.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = scanner.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = scanner.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = scanner.nextInt();

        total = fizik + matematik + turkce + kimya + muzik + tarih;

        double avarage = total / 6;

        System.out.println("Fizik notunuz: " + fizik);
        System.out.println("Matematik notunuz: " + matematik);
        System.out.println("Türkçe notunuz: " + turkce);
        System.out.println("Kimya notunuz: " + kimya);
        System.out.println("Müzik notunuz: " + muzik);
        System.out.println("Tarih notunuz: " + tarih);
        System.out.println("Not Ortalamanız : " + avarage);
    }
}