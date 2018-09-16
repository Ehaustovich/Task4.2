package Gift;

public class JellyBeans extends Gift {

    private int numberOfFlavors;
    public JellyBeans(String name, int weight, double price, int numberOfFlavors) {
        super(name, weight, price);
        this.numberOfFlavors = numberOfFlavors;
    }

    public int getNumberOfFlavors() {
        return numberOfFlavors;
    }

    public void setNumberOfFlavors(int numberOfFlavors) {
        this.numberOfFlavors = numberOfFlavors;
    }

    @Override
    public String toString() {
        return "Item2 - " + super.toString() + ", numberOfFlavors = " + numberOfFlavors;
    }
}
