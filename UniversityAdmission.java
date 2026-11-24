import java.util.Scanner;

public class UniversityAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Apakah mahasiswa seorang valedictorian/salutatorian? (true/false): ");
        boolean isTopStudent = scanner.nextBoolean();
        
        System.out.print("Masukkan jumlah total siswa di sekolah: ");
        int schoolSize = scanner.nextInt();
        
        System.out.print("Masukkan GPA mahasiswa: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Masukkan skor SAT mahasiswa: ");
        int satScore = scanner.nextInt();
        
        boolean isAccepted = false;
        
        if (isTopStudent && schoolSize >= 1400) {
            isAccepted = true;
        } else if (gpa >= 4.0 && satScore >= 1100) {
            isAccepted = true;
        } else if (gpa >= 3.5 && satScore >= 1300) {
            isAccepted = true;
        } else if (gpa >= 3.0 && satScore >= 1500) {
            isAccepted = true;
        }
        
        if (isAccepted) {
            System.out.println("Selamat! Mahasiswa diterima di Mountville University.");
        } else {
            System.out.println("Mohon maaf, mahasiswa belum memenuhi kriteria penerimaan.");
        }
        
        scanner.close();
    }
}
