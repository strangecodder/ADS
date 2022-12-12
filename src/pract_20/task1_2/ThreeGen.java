package pract_20.task1_2;

public class ThreeGen <T,V,K>{
    private T objectT;
    private V objectV;
    private K objectK;

    ThreeGen(T objectT,V objectV, K objectK){
        this.objectT=objectT;
        this.objectV=objectV;
        this.objectK=objectK;
    }

    public void showClassNames(){
        System.out.println("Тип T"+objectT.getClass().getName());
        System.out.println("Тип K"+objectK.getClass().getName());
        System.out.println("Тип V"+objectV.getClass().getName());
    }
}
