/**
 * Created by Kondratov on 25.03.2018.
 *
 * @author Kondratov
 * @see #getCompany()
 * @see #setCompany(String)
 * @see #toString()
 */
public class Jellybean extends Sweet {
    private String company;

    public Jellybean(String name, int weight, double cost, String company) {
        super(name, weight, cost);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "This jellybean has parameters: " + super.toString() + ", company - " + company + ".";
    }
}
