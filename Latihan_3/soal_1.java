import java.util.Scanner;

public class soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        
        if (bilangan == 0) {
            System.out.println("Bilangan adalah nol.");
        } else if (bilangan % 2 == 0) {
            System.out.println("Bilangan adalah genap.");
        } else {
            System.out.println("Bilangan adalah ganjil.");
        }
        
        scanner.close();
    }
}

