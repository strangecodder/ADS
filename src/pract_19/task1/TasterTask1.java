package pract_19.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TasterTask1 {
    Map<String, Boolean> stateINN = new HashMap();
    public void keyStore(){
        stateINN.put("000000000000",false);
        stateINN.put("000000000001",true);
    }

    public static String authorize(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ИНН");
        String INN = in.nextLine();
        return INN;
    }

    public static void checkLength(String INN) throws WrongLengthExeption{
        if(INN.length()!=12){
            throw new WrongLengthExeption("Less than 12");
        }
    }

    public static void  checkMapValue(boolean flag) throws InvalidDataExeption{
        if(flag==false){
            throw new InvalidDataExeption("Invalid data");
        } else {
            System.out.println("Truth data");
        }
    }

    public static void main(String[] args)  {
        AuthorizeSystem keyStorage = new AuthorizeSystem();

        String inn = authorize();
        boolean flag;

        try {
            checkLength(inn);
        } catch (WrongLengthExeption e) {
            System.err.println(e.getMessage());
        }

        flag = keyStorage.returnKey(inn);
        try {
            checkMapValue(flag);
        } catch (InvalidDataExeption e){
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Program complete");
        }

    }
}
