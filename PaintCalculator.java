import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang ruangan (meter): ");
        double length = scanner.nextDouble();
        
        System.out.print("Masukkan lebar ruangan (meter): ");
        double width = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi ruangan (meter): ");
        double height = scanner.nextDouble();
        
        // Luas dinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi)
        double wallArea = 2 * (length * height) + 2 * (width * height);
        // Luas langit-langit = panjang * lebar (tanpa lantai)
        double ceilingArea = length * width;
        double totalArea = wallArea + ceilingArea;
        
        System.out.println("Total luas permukaan yang dicat: " + totalArea + " meter persegi.");
        
        // Asumsi standar daya sebar ember 5 liter (misal menutupi 15 meter persegi per liter atau sesuai spesifikasi soal)
        // Disini kita buat program generik untuk kalkulasi dasar ember cat
        double coveragePerLiter = 3.0; // contoh konversi
        double totalPaintNeeded = totalArea / coveragePerLiter;
        
        System.out.println("Estimasi total cat yang dibutuhkan: " + totalPaintNeeded + " liter.");
        
        scanner.close();
    }
}