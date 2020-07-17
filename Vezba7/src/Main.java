import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prviBroj = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        int drugiBroj = sc.nextInt();

        int rezultat = prviBroj+drugiBroj;
        System.out.println("Zbir je: "+rezultat);
    }
}
