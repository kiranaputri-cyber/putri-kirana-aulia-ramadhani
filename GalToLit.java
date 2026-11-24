import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        // deklarasi Scanner untuk menerima input dari user
        Scanner in = new Scanner(System.in);
        
        // declare variables
        double gallons = 0;
        double liters = 0;
        
        // meminta input dari pengguna
        System.out.print("Masukkan jumlah galon yang ingin dikonversi: ");
        gallons = in.nextDouble();
        
        // proses kalkulasi konversi ke liter
        liters = gallons * 3.785;
        
        // output the result to user
        System.out.println(gallons + " gallons equals " + liters + " liters");
        
        // menutup Scanner
        in.close();
    }
}