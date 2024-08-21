import java.util.Scanner;

public class soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan tersebut adalah positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan tersebut adalah negatif.");
        } else {
            System.out.println("Bilangan tersebut adalah nol.");
        }

        scanner.close();
    }
}
