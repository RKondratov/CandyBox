/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @see #getTaste()
 * @see #setTaste(String)
 * @see #toString()
 */
public class Chocolate extends Sweet {
    private String taste;

    public Chocolate(String name, int weight, double cost, String taste) {
        super(name, weight, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "This chocolate has parameters: " + super.toString() + ", taste - " + taste + ".";
    }
}
