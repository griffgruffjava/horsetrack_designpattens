/**
 * Created by t00175569 on 08/12/2016.
 */
public class PlaceBet extends BetStrategy {

    private String raceName;
    private String horseName;

    public PlaceBet(String raceName, String horseName) {
        this.raceName = raceName;
        this.horseName = horseName;
    }

    @Override
    public void betSlip(double bet) {
        System.out.println(bet + " on " + horseName + " to come 1st, 2nd, or 3rd in the " + raceName);
    }
}
