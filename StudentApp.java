class Student {
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    public Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = calculateGPA();
    }

    // a. Mengembalikan rata-rata IP saat ini (poin mutu / kredit)
    public double calculateGPA() {
        if (credits == 0) return 0.0;
        return qualityPoints / credits;
    }

    // b. Menambah kredit dan poin mutu baru, lalu memperbarui kredit, poin mutu, dan IP
    public void addCourse(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gpa = calculateGPA();
    }

    public String getName() { return name; }
    public int getCredits() { return credits; }
    public double getQualityPoints() { return qualityPoints; }
    public double getGpa() { return gpa; }

    public void printInfo() {
        System.out.printf("Nama: %s | Kredit: %d | Poin Mutu: %.1f | IP (GPA): %.2f%n",
                name, credits, qualityPoints, gpa);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        // Soal 5: Tiga instance mahasiswa
        Student s1 = new Student("Mary Jones", 14, 46);
        Student s2 = new Student("John Stiner", 60, 173);
        Student s3 = new Student("Ari Samala", 31, 69);

        System.out.println("=== Data Awal Mahasiswa ===");
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        // Soal 6: Tambah 13 kredit dan 52 poin mutu ke Ari Samala
        s3.addCourse(13, 52);

        System.out.println("\n=== Data Ari Samala Setelah Penambahan ===");
        s3.printInfo();
    }
}