import java.util.Date;

public class Student extends Person {
    private String studentId;
    private double gpa;
    private String major;
    private String degreePursued;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String studentId, String major, String degreePursued, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degreePursued = degreePursued;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegreePursued() { return degreePursued; }
    public int getExpectedGraduationYear() { return expectedGraduationYear; }

    // Method untuk administrator mengubah jurusan mahasiswa
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    // Method menghitung IP dari array nilai huruf (A, A-, B+, B, B-, C+, C, D, F)
    public double calculateGPA(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return this.gpa;
        }

        double totalPoints = 0.0;
        for (String grade : grades) {
            switch (grade.toUpperCase()) {
                case "A":  totalPoints += 4.0; break;
                case "A-": totalPoints += 3.67; break;
                case "B+": totalPoints += 3.33; break;
                case "B":  totalPoints += 3.0; break;
                case "B-": totalPoints += 2.67; break;
                case "C+": totalPoints += 2.33; break;
                case "C":  totalPoints += 2.0; break;
                case "D":  totalPoints += 1.0; break;
                case "F":  totalPoints += 0.0; break;
                default: break;
            }
        }

        this.gpa = totalPoints / grades.length;
        return this.gpa;
    }
}