package pract_9.task1;

public class Student {
    private int id;
    private String name;


    Student(){};
    Student(int id, String name){
        this.name = name;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void sort(Student[] students){
        for(int i =0;i<students.length;i++){
            if(students[i].getId() < students[i+1].getId()){
                while (students[i].getId()>students[i+1].getId()){
                    Student student = students[i+1];
                    students[i+1] = students[i];
                    students[i]=student;
                    i--;
                }
            }
        }
    }
}
