/**
 * Created by t00175569 on 08/12/2016.
 */
public class WinBet extends BetStrategy {

    private String raceName;
    private String horseName;

    public WinBet(String raceName, String horseName) {
        this.raceName = raceName;
        this.horseName = horseName;
    }

    @Override
    public void betSlip(double bet) {
        System.out.println(bet + " on " + horseName + " to win in the " + raceName);
    }

}

