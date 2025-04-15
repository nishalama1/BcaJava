package Classwork;
public class classManagement{
  static String courseName="BCA";
  static String semester="Second";
  static int subject=5;
  static int totalStudents=35;
  static int totalMale=16;
  static int female=0;
  static float totalMarks=100.0f;
  static float obtainedMarks=46.5f;
  static float avgPercent=0;

 
    public static void main (String[]args){
      
      female=calculate();
      avgPercent=average();
      printStatement();

    } 
  
    public static int calculate(){
      int totalFemale=totalStudents-totalMale;
      return totalFemale;
    }

    public static float average(){
      float averagePercent=obtainedMarks/totalMarks*100;
      return averagePercent;
    }


public static void printStatement(){
  System.out.println("Course Name: "+courseName);
  System.out.println("Semester: "+semester);
  System.out.println("total subject:"+ subject);
  System.out.println("total number of students: "+ totalStudents);
  System.out.println("total number of male:" + totalMale);
  System.out.println("total number of female is:"+female);
  System.out.println("total marks: " +totalMarks);
  System.out.println("Average percentage is: "+avgPercent);
  
 
}
}