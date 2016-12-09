/**
 * Created by t00175569 on 08/12/2016.
 */
public abstract class BetSlipDecorator extends AbstractBetSlip {

    private AbstractBetSlip abstractBetSlip;
    private double amount;
    private String horseName;
    private String raceName;

    public BetSlipDecorator(AbstractBetSlip abstractBetSlip, double amount, String horseName, String raceName) {
        this.abstractBetSlip = abstractBetSlip;
        this.amount = amount;
        this.horseName = horseName;
        this.raceName = raceName;
    }

    public abstract String getBetSummary();

    public double betTotal() {

        return abstractBetSlip.betTotal() + amount;
    }

    public AbstractBetSlip getAbstractBetSlip() {
        return abstractBetSlip;
    }

    public double getAmount() {
        return amount;
    }

    public String getHorseName() {
        return horseName;
    }

    public String getRaceName() {
        return raceName;
    }
}
