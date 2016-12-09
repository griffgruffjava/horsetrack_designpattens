/**
 * Created by t00175569 on 09/12/2016.
 */
public class DecoratorDriver {

    public static void main(String[] args) {
        AbstractBetSlip myBetSlip = new BetSlip();

        myBetSlip = new PlaceBet(myBetSlip,30.0,"gluegun","the hunt");
        myBetSlip = new WinBet(myBetSlip, 25,"gluegun","the hunt");
        myBetSlip = new WinBet(myBetSlip, 25,"woodglue","the hunt");

        System.out.println(myBetSlip.getBetSummary());
        System.out.println(myBetSlip.getStringTotal());
    }
}
