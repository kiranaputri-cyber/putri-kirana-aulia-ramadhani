import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan alas segitiga (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = scanner.nextDouble();
        
        double area = 0.5 * b * h;
        
        System.out.println("Luas segitiga: " + area);
        
        scanner.close();
    }
}