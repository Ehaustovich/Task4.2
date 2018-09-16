package Gift;

public class Candy extends Gift {

    private String flavour;

    public Candy(String name, int weight, double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Item1 - " + super.toString() + ", flavour = " + flavour;
    }
}

