public class StudentDriver {
    public static void main(String[] args) {
        // Membuat object baru dari class Student
        Student student1 = new Student();
        
        // Mencetak informasi object sesuai format yang diminta
        System.out.println("Student Name: " + student1.fName + " " + student1.lName);
        System.out.println("Student ID: " + student1.stuId);
        System.out.println("Student Status: " + student1.stuStatus);
    }
}