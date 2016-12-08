/**
 * Created by t00175569 on 08/12/2016.
 */
public class WinBet extends BetSlipDecorator {



    private AbstractBetSlip abstractBetSlip;
    private double amount;
//    private String horseName;
//    private String raceName;

    public WinBet(AbstractBetSlip abstractBetSlip, double amount/*, String horseName, String raceName*/) {
        this.abstractBetSlip = abstractBetSlip;
        this.amount = amount;
//        this.horseName = horseName;
//        this.raceName = raceName;
    }


    @Override
    public String getBetSummary() {
        System.out.println("yo yo");
        return abstractBetSlip.getBetSummary() + "\n$"+ amount + " on " /*+ horseName + " to WIN in " + raceName*/;
    }

    public double betTotal() {

        return abstractBetSlip.betTotal() + amount;
    }


//    private String raceName;
//    private String horseName;
//
//    public WinBet(String raceName, String horseName) {
//        this.raceName = raceName;
//        this.horseName = horseName;
//    }
//
//    @Override
//    public void betSlip(double bet) {
//        System.out.println(bet + " on " + horseName + " to win in the " + raceName);
//    }

}

