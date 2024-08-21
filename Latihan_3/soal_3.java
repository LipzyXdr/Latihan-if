import java.util.Scanner;

public class soal_3 {
    public static void main(String[] args){
        String[] alat ={
            "buku",
            "pulpen",
            "pensil",
            "penghapus",
            "penggaris",
        };
            Scanner scanner = new Scanner(System.in);

            // Menampilkan menu pilihan kepada pengguna
            System.out.println("Pilih alat keperluan sekolah berdasarkan angka berikut:");
            for (int i = 0; i < alat.length; i++) {
                System.out.println((i + 1) + ". " + alat[i]);
            }
    
            // Mengambil input dari pengguna
            System.out.print("Masukkan angka pilihan Anda (1-" + alat.length + "): ");
            int pilihan = scanner.nextInt();
    
            // Menampilkan alat keperluan sekolah sesuai dengan pilihan pengguna
            if (pilihan >= 1 && pilihan <= alat.length) {
                System.out.println("Anda memilih: " + alat[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid. Harap masukkan angka antara 1 dan " + alat.length);
            }
    
            // Menutup Scanner
            scanner.close();
    }
    
}
