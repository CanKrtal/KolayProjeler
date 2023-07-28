import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kenar1, kenar2;
        double hipotenus = 0;

        System.out.println("1.Kenarı giriniz: ");
        kenar1 = scanner.nextInt();
        System.out.println("2.Kenarı giriniz: ");
        kenar2 = scanner.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));

        System.out.println("1.Kenar: " + kenar1);
        System.out.println("2.Kenar: " + kenar2);
        System.out.println("Hipotenüs: " + hipotenus);
    }
}