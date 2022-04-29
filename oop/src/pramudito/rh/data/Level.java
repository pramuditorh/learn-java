package pramudito.rh.data;

public enum Level {
    STANDARD("Standard package"),
    PREMIUM("Premium package"),
    VIP("VIP package");

    private String description;

    // Constructor di Enum tidak boleh public
    Level(String description) {
        this.description = description;
    }

    // Method
    public String getDescription() {
        return description;
    }
}
