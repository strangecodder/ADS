package pract_6.ex4;

public class Test {
    public static void main(String[] args){
        Computer computer1 = new Computer("Aser", 350);
        Computer computer2 = new Computer("MacBook", 500);

        System.out.println(computer1.getPrice());
        System.out.println(computer2.getPrice());
    }
}
