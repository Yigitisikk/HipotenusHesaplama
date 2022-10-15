import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        int a, b;
        double c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı Griniz : ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı Griniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs : "+ c);
    }
}
