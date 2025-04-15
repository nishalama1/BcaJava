
package Studentmanagementsystem.University;

import Studentmanagementsystem.People.Person;

public class Student extends Person{
    private String StudentId;
    private String CourseName;

    public Student(String name, int age, String nationalId, String StudentId, String CourseName){
     super(name, age,nationalId);
     this.StudentId=StudentId;
     this.CourseName=CourseName;
       }
     @Override
     public void printDetails(){
        super.printDetails();
        System.out.println("Student ID:"+StudentId+",Coursename:"+CourseName);
     }
}
