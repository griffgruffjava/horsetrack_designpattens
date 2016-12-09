/**
 * Created by t00175569 on 08/12/2016.
 */
public class WinBet extends BetSlipDecorator {


    public WinBet(AbstractBetSlip abstractBetSlip, double amount, String horseName, String raceName) {
        super(abstractBetSlip, amount, horseName, raceName);
    }

    @Override
    public String getBetSummary() {
        return super.getAbstractBetSlip().getBetSummary() + "\n$" + super.getAmount() + " on " + super.getHorseName() + " to WIN in " + super.getRaceName();
    }

}

