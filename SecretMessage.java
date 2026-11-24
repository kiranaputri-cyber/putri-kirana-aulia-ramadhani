import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decodedMessage = "";
        
        System.out.println("Masukkan 10 angka rahasia satu per satu (angka yang valid: 1 s.d. 7):");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int code = scanner.nextInt();
            
            char letter = ' ';
            boolean valid = true;
            
            // Pengecekan mapping angka ke huruf
            switch (code) {
                case 1: letter = 'D'; break;
                case 2: letter = 'W'; break;
                case 3: letter = 'E'; break;
                case 4: letter = 'L'; break;
                case 5: letter = 'H'; break;
                case 6: letter = 'O'; break;
                case 7: letter = 'R'; break;
                default:
                    System.out.println("Angka belum terpecahkan! Silakan masukkan angka baru.");
                    i--; // Mengulang iterasi untuk posisi input saat ini
                    valid = false;
            }
            
            if (valid) {
                decodedMessage += letter;
            }
        }
        
        System.out.println("\nPesan rahasia yang terurai: " + decodedMessage);
        scanner.close();
    }
}