package ArrayListUsage;
// import java.util.ArrayList;

public class Student{
  String name;
  int id;
  String course;

  public Student(String name, int id, String course){
    this.name=name;
    this.id=id;
    this.course=course;
  }
  public void PrintDetails(){
    System.out.println( name + id + course );
  }
}