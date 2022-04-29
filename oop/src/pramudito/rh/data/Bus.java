package pramudito.rh.data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("I am driving a bus");
    }

    @Override
    public String getFuel() {
        return "Solar";
    }

    @Override
    public boolean isBig() {
        return true;
    }

    @Override
    public String getBrand() {
        return "Volvo";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
