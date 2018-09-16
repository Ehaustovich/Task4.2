package Gift;

public class BubbleGum extends Gift{

    private int numberOfPacks;
    public BubbleGum(String name, int weight, double price, int numberOfPacks) {
        super(name, weight, price);
        this.numberOfPacks = numberOfPacks;
    }

    public int getNumberOfPacks() {
        return numberOfPacks;
    }

    public void setNumberOfPacks(int numberOfPacks) {
        this.numberOfPacks = numberOfPacks;
    }

    @Override
    public String toString() {
        return "Item5 - " + super.toString() + ", numberOfPacks = " + numberOfPacks;
    }
}

