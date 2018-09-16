package Gift;

public class Marshmallows extends Gift {

    private String candysize;

    public Marshmallows(String name, int weight, double price, String candysize) {
        super(name, weight, price);
        this.candysize = candysize;
    }

    public String getCandysize() {
        return candysize;
    }

    public void setCandysize(String candysize) {
        this.candysize = candysize;
    }

    @Override
    public String toString() {
        return "Item4 - " + super.toString() + ", candysize = " + candysize;
    }
}
