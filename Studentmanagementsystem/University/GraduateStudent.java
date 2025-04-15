package Studentmanagementsystem.University;

public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String nationalId, String StudentId, String CourseName, String researchTopic) {
        super(name, age, nationalId, StudentId, CourseName);
        this.researchTopic=researchTopic;

    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Research Topic: "+ researchTopic);
    }
    
}
