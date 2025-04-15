package Studentmanagementsystem.University;

// import javax.security.auth.Subject;

import Studentmanagementsystem.People.Person;

public class Teacher extends Person{
    private String subjectName;

    public Teacher(String name, int age, String nationalId, String subjectName) {
            super(name, age, nationalId);
            this.subjectName=subjectName;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Subject:"+subjectName);
        System.out.println("National Id (Accessible in Teacher):"+ getNationalId());
    }

}
