/**
 * Created by Finbar on 08/12/2016.
 */
public class Horse implements Comparable<Horse>{

    String name;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Horse o) {
        return this.getName().compareTo(o.getName());
    }
}
