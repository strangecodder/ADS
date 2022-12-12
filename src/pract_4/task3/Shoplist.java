package pract_4.task3;

public enum Shoplist {
    Computer("Computer","Lenovo", 34566),
    Phone("Phone","Iphone",12544),
    Tablet("Tablet","Samsung",24500);

    private final static String typeComputer = "Computer";
    private final static String typePhone = "Phone";
    private final static String typeTablet = "Tablet";

    private String type;
    private String name;
    private double cost;

    Shoplist(String type,String name, double cost){
        this.type=type;
        this.name = name;
        this.cost = cost;
    }
}