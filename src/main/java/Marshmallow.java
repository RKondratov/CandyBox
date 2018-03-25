/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @see #getColour()
 * @see #setColour(String)
 * @see #toString()
 */
public class Marshmallow extends Sweet {
    private String colour;

    public Marshmallow(String name, int weight, double cost, String colour) {
        super(name, weight, cost);
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
        return "This marshmallow has parameters: " + super.toString() + ", colour - " + colour + ".";
    }
}
