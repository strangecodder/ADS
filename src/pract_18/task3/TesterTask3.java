package pract_18.task3;

import java.util.Scanner;

public class TesterTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String intString = in.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println("Ошибка!");
        }
    }
}
