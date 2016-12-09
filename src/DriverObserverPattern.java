import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class DriverObserverPattern {
    public static void main(String[] args) {

        RaceFactory raceFactory = new RaceFactory();
        Set<Horse> someHorses = UtilityClass.createSetOfFiveHorses();


        AbstractRace race1 = raceFactory.createRace("The 5.15", 30, "dry");
        race1.setHorses(someHorses);
        AbstractRace race2 = raceFactory.createRace("The 5.25", 30, "dry");
        race2.setHorses(someHorses);
        AbstractRace race3 = raceFactory.createRace("The 5.35", 30, "dry",10);
        race3.setHorses(someHorses);

        List<AbstractRace> races  = new ArrayList<>();
        races.add(race1);
        races.add(race2);
        races.add(race3);

        RaceCard raceCard = new RaceCard.RaceCardBuilder().date(LocalDate.now()).races(races).build();
//        System.out.println(raceCard.toString());

//        race1 = RunRace.runIt(race1);
//        System.out.println(race1.toString());
//        System.out.println(raceCard.toString());

        BetSlip slip = new BetSlip();

        Punter punter = new Punter(raceCard,slip);

        race1 = RunRace.runIt(race1);
        race2 = RunRace.runIt(race2);
        race3 = RunRace.runIt(race3);

        System.out.println(raceCard.toString());


//        Punter punter = new Punter(race1);

//        race1.setResults("1","2","3");


    }
}
