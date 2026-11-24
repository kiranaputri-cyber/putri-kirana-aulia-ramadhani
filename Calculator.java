import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama (double): ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Masukkan bilangan kedua (double): ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        // Menggunakan logika switch
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) result = num1 / num2;
                else { System.out.println("Error: Pembagian dengan nol!"); valid = false; }
                break;
            case '%': 
                if (num2 != 0) result = num1 % num2;
                else { System.out.println("Error: Modulus dengan nol!"); valid = false; }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }
        
        if (valid) {
            System.out.println("Hasil (Switch): " + result);
        }
        
        // Alternatif menggunakan logika if/else
        /*
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Hasil (If-Else): " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Hasil (If-Else): " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Hasil (If-Else): " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Hasil (If-Else): " + result);
            } else {
                System.out.println("Error: Pembagian dengan nol!");
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println("Hasil (If-Else): " + result);
            } else {
                System.out.println("Error: Modulus dengan nol!");
            }
        } else {
            System.out.println("Operator tidak valid!");
        }
        */
        
        scanner.close();
    }
}