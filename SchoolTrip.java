import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalPeople = scanner.nextInt();
        
        int busCapacity = 45;
        int busesNeeded = totalPeople / busCapacity;
        int peopleInVans = totalPeople % busCapacity;
        
        System.out.println("Jumlah bus yang diperlukan: " + busesNeeded);
        System.out.println("Jumlah orang yang naik van: " + peopleInVans);
        
        scanner.close();
    }
}