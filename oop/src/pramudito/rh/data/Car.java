package pramudito.rh.data;

public interface Car extends HasBrand, IsMaintenance{
    void drive();
    String getFuel();

    // Default method, boleh dioverride boleh tidak ketika interface diimplement
    default boolean isBig() {
        return false;
    }
}
