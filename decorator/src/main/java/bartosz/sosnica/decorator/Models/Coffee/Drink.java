package bartosz.sosnica.decorator.Models.Coffee;

public abstract class Drink {

    public enum Size {
        SMALL, MEDIUM, LARGE
    };

    Size size = Size.SMALL;
    String description = "Unknown drink";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();

}
