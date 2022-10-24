package pract_4;

import java.util.Scanner;

interface MenClothes{
     void getClothes();
}
interface WomenClothes{
    void getClothes();
}

class Clothes{
    protected char gender;
    protected sizes size;
    protected double cost;
    protected String color;

    Clothes(char gender, sizes size, double cost, String color){
        this.gender=gender;
        this.size=size;
        this.cost=cost;
        this.color=color;
    }
    Clothes(sizes size, double cost, String color){
        this.size=size;
        this.cost=cost;
        this.color=color;
    }

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
        super(gender, size, cost, color);
    }
    public void getClothes(){
        System.out.println();
    }
}

class Pants extends Clothes{
    Pants(char gender, sizes size , double cost, String color){
        super(gender, size, cost, color);
    }
}

class Skirt extends Clothes{
    Skirt(sizes size , double cost, String color){
        super(size, cost, color);
        this.gender='f';
    }
}

class Tie extends Clothes{
    Tie(sizes size , double cost, String color){
        super(size, cost, color);
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
    private Clothes clothes[];

    public void add(int i, Clothes cl){
        clothes[i]=cl;
    }

    Atelier(){}
    Atelier(int i, Clothes cl){

    }

    public void addq(String clotherName,String color,double cost,char gender,sizes size ){
        switch (clotherName){
            case "TShirt"-> new TShirt(gender,size,cost, color);
            case "Skirt"-> new Skirt(size,cost, color);
            case "Pants"->new Pants(gender,size,cost, color);
            case "Tie"->new Tie(size,cost, color);
        }
    }
}

public class atCl {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Atelier atelier = new Atelier();
    }
}


/*
1)Реализовать множественное наследование через интерфейс?
2)Понять, как вводить данные с клавы
3)Продумать логику вывода информации!!!
4)Почистить код
* */
