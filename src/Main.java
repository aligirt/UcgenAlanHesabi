import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, cevre;
        double alan, u;

        Scanner unit = new Scanner(System.in);
        System.out.print("Birinci Kenar Uzunluğunu giriniz :");
        a = unit.nextInt();
        System.out.print("İkinci Kenar Uzunluğunu giriniz :");
        b = unit.nextInt();
        System.out.print("Üçüncü Kenar Uzunluğunu giriniz :");
        c = unit.nextInt();

        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u-a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi = " + cevre);
        System.out.println("Üçgenin Alanı = " + alan);

    }
}