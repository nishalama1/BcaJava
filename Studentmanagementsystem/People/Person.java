package Studentmanagementsystem.People;

public class Person {
    private String nationalId;
    protected String name;
    protected int age;

    public Person(String name, int age, String nationalId){
        this.name=name;
        this.age=age;
        this.nationalId=nationalId;

    }

    public void printDetails(){
        System.out.println("Name:"+ name +"Age:"+ age);

    }

    protected String getNationalId(){//not accesible in main but accible in subclasses
       
        return nationalId;
    
    }

}
