/**
 * Created by Finbar on 08/12/2016.
 */
public class RaceHorse extends Horse {

    private double odds;

    public RaceHorse(String name, double odds) {
        super(name);
        this.odds = odds;
    }

    public RaceHorse(Horse horse, double odds){
        super(horse.getName());
        this.odds = odds;
    }
}
