package Studentmanagementsystem.Main;
import Studentmanagementsystem.University.GraduateStudent;
import Studentmanagementsystem.University.Student;
import Studentmanagementsystem.University.Teacher;


public class Main {
 

public static void main(String[] args) {
    Student student = new Student("Jenny", 18, "12345", "s1111", "Java");
    Teacher teacher = new Teacher("Sushant",  45, "123557", "Science");
    GraduateStudent graStudent = new GraduateStudent("Nisha", 20, "12341", "s122", "Java", "Machine Learning");

    System.out.println("Student Details :");
    student.printDetails();
    System.out.println("\nTeacher Details :");
    teacher.printDetails();
    System.out.println("\nGraduate Student Details :");
    graStudent.printDetails();
}
}
