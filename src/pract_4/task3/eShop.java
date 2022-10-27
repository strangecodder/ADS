package pract_4.task3;

import java.util.Scanner;

public class eShop {

    public static boolean auth(int password, int enterPassword){
        boolean enter = false;
        if(enterPassword==password){
            enter = true;
        } else {
            System.out.println("Неверный пароль. Введите пароль ещё раз");
        }
        return enter;
    }

    public static void mai(String[] args){
        Scanner in = new Scanner(System.in);
        int password=1234;
        boolean enter = false;

        System.out.println("Добро пожаловать в интернет магазин, введите пароль");
        while (enter==false){
            int enterPassword = in.nextInt();
            auth(password,enterPassword);
        }
    }
}