import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matA = null;
        int[][] matB = null;
        char choice;

        do {
            System.out.println("\n=== MENU KALKULATOR MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu: ");
            choice = Character.toLowerCase(sc.next().charAt(0));

            switch (choice) {
                case 'a':
                    matA = inputMatrix(sc, "A");
                    break;
                case 'b':
                    matB = inputMatrix(sc, "B");
                    break;
                case 'c':
                    if (canAddOrSubtract(matA, matB)) {
                        printMatrix(addMatrices(matA, matB));
                    }
                    break;
                case 'd':
                    if (canAddOrSubtract(matA, matB)) {
                        printMatrix(subtractMatrices(matA, matB));
                    }
                    break;
                case 'e':
                    if (canMultiply(matA, matB)) {
                        printMatrix(multiplyMatrices(matA, matB));
                    }
                    break;
                case 'f':
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi ya.");
            }
        } while (choice != 'f');

        sc.close();
    }

    public static int[][] inputMatrix(Scanner sc, String name) {
        System.out.print("Masukkan jumlah baris Matriks " + name + " (2 atau 3): ");
        int rows = sc.nextInt();
        System.out.print("Masukkan jumlah kolom Matriks " + name + " (2 atau 3): ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Masukkan elemen Matriks " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static boolean canAddOrSubtract(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Pastikan Matriks A dan Matriks B sudah diisi dulu.");
            return false;
        }
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Ukuran matriks harus sama untuk penjumlahan/pengurangan.");
            return false;
        }
        return true;
    }

    public static boolean canMultiply(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Pastikan Matriks A dan Matriks B sudah diisi dulu.");
            return false;
        }
        if (a[0].length != b.length) {
            System.out.println("Jumlah kolom Matriks A harus sama dengan jumlah baris Matriks B.");
            return false;
        }
        return true;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;
        int[][] res = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += a[i][k] * b[k][j];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Hasil Matriks:");
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println("]");
        }
    }
}