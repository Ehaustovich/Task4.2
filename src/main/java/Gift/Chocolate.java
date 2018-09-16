package Gift;

public class Chocolate extends Gift{

    private String colour;
    public Chocolate(String name, int weight, double price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Item3 - " + super.toString() + ", colour = " + colour;
    }
}
