package pract_4_1.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(){}
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }

    public String receiveCall(String name){
        return "Звонит " + name + '\n';
    }
    public String receiveCall(String name, String number){
        return "Звонит " + number +" "+ name;
    }
    public String getNumber(){
        return number;
    }
    public String toString(){
        return number+" "+model+ " " +weight;
    }
    public void sendMessage(String firstName, String[] name){
        System.out.println();
        for (String x: name) {
            System.out.println(x+",");
        }
    }
}
