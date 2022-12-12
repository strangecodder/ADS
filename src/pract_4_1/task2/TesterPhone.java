package pract_4_1.task2;

public class TesterPhone {
    public static void main(String[] args){
        Phone phone1 = new Phone("8(999)-777-66-55","Iphone",15.7);
        Phone phone2 = new Phone("8(987)-654-32-10","Samsung",28.4);
        Phone phone3 = new Phone("1(234)-567-89-01","Xaomi",23.0);

        //toString test
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        //getNumber test
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        //receiveCall test
        System.out.println(phone1.receiveCall("Jack"));
        System.out.println(phone2.receiveCall("Tom"));
        System.out.println(phone3.receiveCall("Ivan"));

        System.out.println(phone1.receiveCall("Donald the Duck ", phone2.getNumber()));


    }
}
