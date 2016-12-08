/**
 * Created by t00175569 on 08/12/2016.
 */
public class PlaceBet extends BetSlipDecorator {

    private AbstractBetSlip abstractBetSlip;
    private double amount;
    private String horseName;
    private String raceName;

    public PlaceBet(AbstractBetSlip abstractBetSlip, double amount, String horseName, String raceName) {
        this.abstractBetSlip = abstractBetSlip;
        this.amount = amount;
        this.horseName = horseName;
        this.raceName = raceName;
    }


    @Override
    public String getBetSummary() {
        System.out.println("yo yo");
        return abstractBetSlip.betSummary + "\n$"+ amount + " on " + horseName + " to PLACE in " + raceName;
    }

    public double betTotal() {

        return abstractBetSlip.betTotal() + amount;
    }


}
