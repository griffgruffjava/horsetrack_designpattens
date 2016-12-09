import java.util.Set;
import java.util.TreeSet;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class FactoryDriver {
    public static void main(String[] args) {

        RaceFactory raceFactory = new RaceFactory();

        AbstractRace race1 = raceFactory.createRace("The Grand National",30, "wet");
        AbstractRace race2 = raceFactory.createRace("The 4:15",25, "muddy",10);

        Horse h1 = new Horse("Prancer");
        Horse h2 = new Horse("Dancer");
        Horse h3 = new Horse("Slow Poke");
        Horse h4 = new Horse("Gluey");

        Set<Horse> race1Horses = new TreeSet<>();
        race1Horses.add(h1);
        //Duplicate horse won't be added
        race1Horses.add(h1);
        race1Horses.add(h2);
        race1Horses.add(h3);
        race1Horses.add(h4);

        race1.setHorses(race1Horses);

        System.out.println(race1.toString());
        System.out.println(race2.toString());
    }
}
