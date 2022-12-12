package pract_19.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthorizeSystem {
    private Map<String, Boolean> stateINN = new HashMap();

    public void keyStore(){
        stateINN.put("000000000000",false);
        stateINN.put("000000000001",true);
    }

    public boolean returnKey(String INN){
        if (stateINN.containsKey(INN)){
            return true;
        }else {
            return false;
        }
//        return stateINN.get(INN);
    }
    public void checkLength(String INN) throws WrongLengthExeption{
        if(INN.length()!=12){
            throw new WrongLengthExeption("Less than 12");
        }
    }
    public void checkMapValue(String INN) throws InvalidDataExeption{
        if(returnKey(INN)==false){
            throw new InvalidDataExeption("Invalid data");
        }
    }


}
