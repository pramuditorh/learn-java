package pramudito.rh.data;

public class Model3 implements Car{
    @Override
    public void drive() {
        System.out.println("I drive Model 3");
    }

    @Override
    public String getFuel() {
        return "Battery";
    }

    @Override
    public String getBrand() {
        return "My Car is Tesla";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
