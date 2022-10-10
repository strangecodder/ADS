package thirdPract.task1;

import java.util.Scanner;

class Clothes{
    protected char gender;
    protected sizes size;
    protected double cost;
    protected String color;

    @Override
    public String toString() {
        return
                "Одежда: "+getClass()+"\n"+
                "Пол: " + gender +"\n"+
                "Размер: " + size +"\n"+
                "Цвет: " + color +"\n"+
                "Цена: " + cost ;
    }
}

class TShirt extends Clothes{
    TShirt(char gender, sizes size, double cost,String color){
        this.gender=gender;
        this.size=size;
        this.cost=cost;
        this.color=color;
    }
}

class Pants extends Clothes{
    Pants(char gender, sizes size , double cost, String color){
        this.gender=gender;
        this.size=size;
        this.cost=cost;
        this.color=color;
    }
}

class Skirt extends Clothes{
    Skirt(sizes size , double cost, String color){
        this.size=size;
        this.cost=cost;
        this.color=color;
        this.gender='f';
    }
}

class Tie extends Clothes{
    Tie(sizes size , double cost, String color){
        this.size=size;
        this.cost=cost;
        this.color=color;
        this.gender='m';
    }
}

enum sizes{
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    sizes(){}

    sizes(int euroSize){
        this.euroSize=euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }
    public String getDescription(sizes XXS){
        return "Детский размер";
    }
}

class Atelier{
    public void add(String clotherName,String color,double cost,char gender,sizes size ){
        switch (clotherName){
            case "Футболка"-> new TShirt(gender,size,cost, color);
            case "Юбка"-> new Skirt(size,cost, color);
            case "Штаны"->new Pants(gender,size,cost, color);
            case "Гастук"->new Tie(size,cost, color);
        }
    }
}

public class atCl {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        Clothes array[] = new Clothes[5];
        for (int i = 0;i<array.length;i++){
            String color=in.nextLine();
            double cost=in.nextDouble();
            char gender = in.next().charAt(0);
            String sz = in.nextLine();
            //sizes sizes = ;
        }
    }
}
