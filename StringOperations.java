public class StringOperations {
    public static void main(String[] args) {
        // 1. Tiga cara berbeda mendeklarasikan dan menginstansiasi String "myString" berisi "abc"
        String myString1 = "abc"; // Cara 1: String Literal
        String myString2 = new String("abc"); // Cara 2: Menggunakan keyword new
        char[] charArray = {'a', 'b', 'c'};
        String myString3 = new String(charArray); // Cara 3: Menggunakan array char

        System.out.println("myString1: " + myString1);
        System.out.println("myString2: " + myString2);
        System.out.println("myString3: " + myString3);

        // 2. Demonstrasi perbandingan String (Soal Nomor 2)
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("\n--- Hasil Perbandingan String ---");
        System.out.println("a. s1.compareTo(s2): " + s1.compareTo(s2)); // Negatif
        System.out.println("b. s2.equals(s3): " + s2.equals(s3)); // false
        System.out.println("c. s3 == s1: " + (s3 == s1)); // false
        System.out.println("d. s2.compareTo(s3): " + s2.compareTo(s3)); // Positif
        System.out.println("e. s3.equals(s1): " + s3.equals(s1)); // true

        // 3. Deklarasi, instansiasi, dan penggabungan dua String ke String ketiga (Soal Nomor 3)
        String kataPertama = "Pemrograman";
        String kataKedua = "Java";
        String hasilGabung = kataPertama + " " + kataKedua;

        System.out.println("\n--- Penggabungan String ---");
        System.out.println("Hasil gabungan: " + hasilGabung);
    }
}