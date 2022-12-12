package pract_6.ex6_8;

public class Shop implements Printable{
    private String shopName;
    private String shopAddress;

    Shop(){}
    Shop(String shopName, String shopAddress)
    {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }
    @Override
    public void print() {
        System.out.println(shopName + " " + shopAddress);
    }
}
