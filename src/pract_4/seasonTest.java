package pract_4;
import java.util.Scanner;

enum Season{
    Autumn(15),
    Winter(-15),
    Spring(10),
    Summer(25);

    private double degree;
    Season(double degree){
        this.degree=degree;
    }
    public double getDegree(){
        return degree;
    }

}

public class seasonTest {

    public static void getDescription(Season season){
        if(season == Season.Autumn){
            System.out.println("Тёплое время года");
        }
        else if(season.getDegree()<0){
            System.out.println("Холодное время года");
        } else {
            System.out.println("Тёплое время года");
        }
    }

    public static void enTell(Season season){
        switch (season){
            case Autumn -> System.out.println("Я люблю осень");
            case Summer -> System.out.println("Я люблю лето");
            case Spring -> System.out.println("Я люблю весну");
            case Winter -> System.out.println("Я люблю зиму");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Season lovely = Season.Autumn;
        enTell(lovely);

        for(int i =0;i<4;i++){

        }
        //System.out.println(lovely);

    }
}
