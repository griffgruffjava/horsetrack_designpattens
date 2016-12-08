/**
 * Created by t00175569 on 08/12/2016.
 */
public class TestTypeBet extends BetDecorator {

    Bet bet;

    public TestTypeBet(Bet bet) {
        this.bet = bet;
    }

    public String getDescription() {
        return bet.getDiscription() + "Win bet";
    }

    public double amount() {
        return .10 + bet.
    }
}
