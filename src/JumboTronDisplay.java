/**
 * Created by t00175569 on 09/12/2016.
 */
public class JumboTronDisplay implements RaceObserver{

    private AbstractRace race;
    private String raceName;
    private String first;
    private String second;
    private String third;

    public JumboTronDisplay(AbstractRace race) {
        this.race = race;
        race.registerRaceObserver(this);
    }

    @Override
    public void updateRaceObserver(String raceName, String first, String second, String third) {
        this.raceName = raceName;
        this.first = first;
        this.second = second;
        this.third = third;
        displayRaceResults();
    }

    public void displayRaceResults() {
        String result = "\nThe Results of the " + raceName
                + "\nWinner - " + first
                + "\nSecond - " + second
                + "\nThird - " + third;

        System.out.println(result);
    }
}
