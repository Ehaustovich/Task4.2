import Gift.Gift;
import Gift.Candy;
import Gift.JellyBeans;
import Gift.Chocolate;
import Gift.Marshmallows;
import Gift.BubbleGum;

public class Base {
    public static void main(String[] args) {
        Candy item1 = new Candy("SomeCandy", 150, 14.99, "Strawberry");
        JellyBeans item2 = new JellyBeans("SomeJellyBeans", 375, 20.15, 5);
        Chocolate item3 = new Chocolate("SomeChocolate", 100, 7.75, "White");
        Marshmallows item4 = new Marshmallows("SomeMarshmallows", 55, 6.55, "Small Balls");
        BubbleGum item5 = new BubbleGum("SomeBubbleGum", 15, 9.99, 3);
        Gift[] newYearGift = {item1, item2, item3, item4, item5};
        System.out.println("NewYearGifr contains:");
        for (Gift someGift : newYearGift) {
            System.out.println(someGift.toString());
        }
        int sumWeight = 0;
        for (Gift someGift : newYearGift) {
            sumWeight = sumWeight + someGift.getWeight();
        }
        System.out.println("Weight of Gift = " + sumWeight);

        double sumPrice = 0;
        for (Gift someGift : newYearGift) {
            sumPrice = sumPrice + someGift.getPrice();
        }
        System.out.println("Price of Gift = " + sumPrice);
    }
}
