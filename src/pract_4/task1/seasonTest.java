package pract_4.task1;
import pract_4.task1.Season;

import java.util.Scanner;

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

        Season season1 = Season.Summer;
        Season season2 = null;

        boolean f = true;
        while(f){
            String choice = in.nextLine();
            switch (choice){
                case (Season.titleAutumn):
                    season2=Season.Autumn;
                    f = false;
                    break;
                case (Season.titleWinter):
                    season2=Season.Winter;
                    f=false;
                    break;
                case (Season.titleSpring):
                    season2=Season.Spring;
                    f=false;
                    break;
                case (Season.titleSummer):
                    season2=Season.Summer;
                    f=false;
                    break;
            }
        }

        System.out.println(season1);
        System.out.println(season2);
        season1.getDescription();
        season2.getDescription();
    }
}
