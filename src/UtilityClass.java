import java.util.Set;
import java.util.TreeSet;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class UtilityClass {

    public static Set createSetOfFiveHorses(){

        Set<Horse> someHorses = new TreeSet<>();
        Horse h1 = new Horse("Prancer");
        Horse h2 = new Horse("Dancer");
        Horse h3 = new Horse("Slow Poke");
        Horse h4 = new Horse("Gluey");
        Horse h5 = new Horse("Turtle");

        someHorses.add(h1);
        someHorses.add(h2);
        someHorses.add(h3);
        someHorses.add(h4);
        someHorses.add(h5);

        return someHorses;
    }
}
