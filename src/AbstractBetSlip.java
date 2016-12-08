/**
 * Created by C_Train on 08/12/2016.
 */
public abstract class AbstractBetSlip {

    String betSummary = "No bets made";


    public String getBetSummary(){
        return betSummary;
    }

    public abstract double betTotal();




}
