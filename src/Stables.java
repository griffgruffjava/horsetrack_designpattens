import java.util.ArrayList;
import java.util.List;



public class Stables {

    private List<Horse> stableHorses = new ArrayList<>();
    private static Stables theStables;

    private Stables(){}

    public static Stables getInstance() {
        if (theStables == null) {
            theStables = new Stables();
        }

        return theStables;
    }

    public void addHorse(Horse horse) {
        stableHorses.add(horse);
        System.out.println(horse.getName() + " is now housed in the stable");
    }

    public void removeHorse(String name) {
        int slot = 0;
        int found = -1;
        for(Horse horse: stableHorses) {
            if(horse.getName().equals(name)) {
                found = slot;
            }
            slot++;
        }
        if(found>=0){
            stableHorses.remove(found);
            System.out.println(name + " is no longer housed in the stables");
        }
        else {
            System.out.println(name + " was not housed in the stables");
        }
    }

    public List<Horse> getStableHorses() {
        return stableHorses;
    }

    public String toString() {
        String horses;
        if(stableHorses.isEmpty()) {
            horses = "There are no horses in the stable";
        } else {
            horses = "The horses currently housed in the Stables are:\n";
            for(Horse h : stableHorses) {
                horses += "-" +h.getName() + "\n";
            }
        }
        return horses;
    }


}
