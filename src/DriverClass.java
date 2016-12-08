import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Finbar on 08/12/2016.
 */
public class DriverClass {
    public static void main(String[] args) {
        Stables newStables = Stables.getInstance();
        Horse h1 = new Horse("Prancer");
        Horse h2 = new Horse("Dancer");

        newStables.addHorse(h1);
        newStables.addHorse(h2);
        newStables.removeHorse(h1.getName());
        newStables.removeHorse(h1.getName());

//        System.out.println(newStables.toString());

        Stables newerStables = Stables.getInstance();

//        System.out.println(newerStables.toString());

        RaceFactory raceFactory = new RaceFactory();

        AbstractRace race1 = raceFactory.createRace("The Grand National",30, "wet");
        AbstractRace race2 = raceFactory.createRace("The 4:15",25, "muddy",10);

        Set<Horse> race1Horses = new TreeSet<>();
//        race1Horses.add(h1);
//        race1Horses.add(h2);
//        race1Horses.add(h1);/

        race1.setHorses(race1Horses);

//        System.out.println(race1.toString());
//        System.out.println(race2.toString());

        AbstractBetSlip betSlip = new BetSlip();
        System.out.println(betSlip.betSummary);

        betSlip = new PlaceBet(betSlip,30.0,"gluegun","the hunt");
        System.out.println(betSlip.betSummary);
        betSlip = new WinBet(betSlip, 25);
        System.out.println(betSlip.betSummary);
        betSlip = new WinBet(betSlip, 25);
        System.out.println(betSlip.betSummary);


    }
}
