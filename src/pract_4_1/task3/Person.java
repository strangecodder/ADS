package pract_4_1.task3;

public class Person {
    private String fullName;
    private int age;

    Person(){}
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String move(){
        return fullName + " идёт";
    }
    public String talk(){
        return fullName + "говорит";
    }
}
