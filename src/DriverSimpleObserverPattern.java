/**
 * Created by t00175569 on 09/12/2016.
 */
public class DriverSimpleObserverPattern {

    public static void main(String[] args) {


        RaceFactory rf = new RaceFactory();

        AbstractRace race = rf.createRace("The 5:00", 15, "dry");

        JumboTronDisplay jtd = new JumboTronDisplay(race);

        race = RunRace.runIt(race);
    }
}
