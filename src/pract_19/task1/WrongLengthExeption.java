package pract_19.task1;

public class WrongLengthExeption extends Exception{

    WrongLengthExeption(String errorMessage){
        super(errorMessage);
    }

    public String toString(){
       return "Wrong length";
   }
}
