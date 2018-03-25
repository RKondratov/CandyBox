/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @version 1.0
 * @see Sweet#getWeight()
 * @see Sweet#getCost()
 * @see Sweet#toString()
 */
public class CandyBox {
    public static void main(String[] args) {
        Candy candy1 = new Candy("\"Mars\"", 256, 32.5, "chocolate");
        Candy candy2 = new Candy("\"Rachok\"", 128, 100, "caramel");
        Jellybean jellybean1 = new Jellybean("\"The first Jellybean\"", 512, 1000, "\"Rot Front\"");
        Chocolate bitterChocolate = new Chocolate("\"Russia\"", 1024, 837, "bitter");
        Chocolate whiteChocolate = new Chocolate("\"White Chocolate\"", 64, 837.2, "sweet");
        Marshmallow marshmallow1 = new Marshmallow("\"I don't know\"", 2048, 333.33, "black");
        Marshmallow marshmallow2 = new Marshmallow("\"I know\"", 32, 32.32, "brown");
        Sweet[] candyBox = {candy1, candy2, jellybean1, bitterChocolate, whiteChocolate, marshmallow1, marshmallow2};
        int allWeight = 0;
        double price = 0;
        for (Sweet sweet : candyBox) {
            System.out.println(sweet.toString());
            allWeight += sweet.getWeight();
            price += sweet.getCost();
        }
        System.out.println("\nThe candy box's price is " + price + " rubles and its weight is " + allWeight + " gramm.");
    }
}
