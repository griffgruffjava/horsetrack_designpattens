

public class PlaceBet extends BetSlipDecorator {



    public PlaceBet(AbstractBetSlip abstractBetSlip, double amount, String horseName, String raceName) {
        super(abstractBetSlip, amount, horseName, raceName);
    }


    @Override
    public String getBetSummary() {
        return super.getAbstractBetSlip().getBetSummary() + "\n$"+ super.getAmount() + " on " + super.getHorseName() + " to PLACE in " + super.getRaceName();
    }




}
