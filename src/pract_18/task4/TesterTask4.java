package pract_18.task4;

import java.util.Scanner;

public class TesterTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String intString = in.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e){
            System.out.println("Неверный формат ввода");
        }finally {
            System.out.println("Завершение задания");
        }
    }
}
