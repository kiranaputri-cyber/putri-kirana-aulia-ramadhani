import java.util.Scanner;

public class ErrorExamples {
    public static void main(String[] args) {
        // a. Syntax error (dikomentari agar program tetap bisa dikompilasi)
        // int angka = 10   <-- kurang titik koma (;) dan tipe penulisan salah
        // System.out.println("Halo"  <-- kurang tanda tutup kurung )

        // b. Logic error: menghitung rata-rata 2 angka tapi lupa dikurung sebelum dibagi 2
        int nilai1 = 80;
        int nilai2 = 90;
        double rataRataSalah = nilai1 + nilai2 / 2; // hasilnya 125.0, bukan 85.0
        System.out.println("Hasil logic error (rata-rata salah): " + rataRataSalah);

        // c. Exception: InputMismatchException / ArithmeticException saat runtime
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan bilangan bulat pembagi: ");
            int pembagi = sc.nextInt();
            int hasilBagi = 100 / pembagi; // memicu ArithmeticException jika pembagi = 0
            System.out.println("Hasil 100 / " + pembagi + " = " + hasilBagi);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception: tidak bisa membagi dengan nol!");
        } finally {
            sc.close();
        }
    }
}