/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @see #getName()
 * @see #setName(String)
 * @see #getWeight()
 * @see #setWeight(int)
 * @see #getCost()
 * @see #setCost(double)
 * @see #toString()
 */
public abstract class Sweet {
    private String name;
    private int weight;
    private double cost;

    public Sweet(String name, int weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "name - " + name + ", weight = " + weight + " gramm, cost = " + cost + " rubles";
    }
}
