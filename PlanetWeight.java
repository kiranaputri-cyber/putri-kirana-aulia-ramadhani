import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan Anda di Bumi (lbs): ");
        double earthWeight = scanner.nextDouble();
        
        System.out.println("\nPilih planet tujuan:");
        System.out.println("1. Merkurius (0.38)");
        System.out.println("2. Venus (0.91)");
        System.out.println("3. Mars (0.38)");
        System.out.println("4. Jupiter (2.36)");
        System.out.println("5. Saturnus (0.92)");
        System.out.println("6. Uranus (0.89)");
        System.out.println("7. Neptunus (1.13)");
        System.out.print("Masukkan pilihan angka (1-7): ");
        int choice = scanner.nextInt();
        
        String planetName = "";
        double conversionFactor = 0.0;
        
        switch (choice) {
            case 1: planetName = "Mercury"; conversionFactor = 0.38; break;
            case 2: planetName = "Venus"; conversionFactor = 0.91; break;
            case 3: planetName = "Mars"; conversionFactor = 0.38; break;
            case 4: planetName = "Jupiter"; conversionFactor = 2.36; break;
            case 5: planetName = "Saturn"; conversionFactor = 0.92; break;
            case 6: planetName = "Uranus"; conversionFactor = 0.89; break;
            case 7: planetName = "Neptune"; conversionFactor = 1.13; break;
            default:
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
        }
        
        double planetWeight = earthWeight * conversionFactor;
        System.out.println("Your weight on " + planetName + " is " + planetWeight + " lbs.");
        
        scanner.close();
    }
}