

public abstract class AbstractBetSlip {

    String betSummary = "No bets made";


    public String getBetSummary(){
        return betSummary;
    }

    public String getStringTotal() {
        return "The total is " + getBetTotal();
    }

    public abstract double getBetTotal();




}
