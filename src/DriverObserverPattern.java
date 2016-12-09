/**
 * Created by t00175569 on 09/12/2016.
 */
public class DriverObserverPattern {
    public static void main(String[] args) {

        RaceFactory raceFactory = new RaceFactory();

        AbstractRace theRace = raceFactory.createRace("The 5.15", 30, "dry");

//        Punter punter = new Punter(theRace);

        theRace.setResults("1","2","3");


    }
}
