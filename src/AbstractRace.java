import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Finbar on 08/12/2016.
 */
public class AbstractRace {

    private String name;
    private double furlongs;
    private String groundCondition;
    private String raceType;
    private Set<Horse> horses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFurlongs() {
        return furlongs;
    }

    public void setFurlongs(double furlongs) {
        this.furlongs = furlongs;
    }

    public String getGroundCondition() {
        return groundCondition;
    }

    public void setGroundCondition(String groundCondition) {
        this.groundCondition = groundCondition;
    }

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    public Set<Horse> getHorses() {
        return horses;
    }

    public void setHorses(Set<Horse> horses) {
        this.horses = horses;
    }

    public String toString() {
        String card = "\nThis is the " + getName() + " " + getRaceType()
                + "\nlength = " + getFurlongs() + " furlongs"
                + "\nground condition = " + getGroundCondition();

        if(null!=horses) {
            card +=  "\nHorses running:";
            for (Horse h : horses) {
                card += "\n-" + h.getName();
            }
        }else {
            card += "\nNo Horses registered for this race yet";
        }


        return card;
    }
}
