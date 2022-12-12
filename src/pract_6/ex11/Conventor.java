package pract_6.ex11;

public class Conventor implements Convertable{
    private double temperature;

    Conventor(){}
    Conventor(double temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public double convert() {
        return temperature-32 * 5/9;
    }

    public double convert(int temperature){
        return temperature*9/5+32;
    }
}
