/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @see #getComposition()
 * @see #setComposition(String)
 * @see #toString()
 */
public class Candy extends Sweet {
    private String composition;

    public Candy(String name, int weight, double cost, String composition) {
        super(name, weight, cost);
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "This candy has parameters: " + super.toString() + ", composition - " + composition + ".";
    }
}
