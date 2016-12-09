/**
 * Created by t00175569 on 09/12/2016.
 */
public class Punter implements RaceCardObserver {

    private RaceCard raceCard;
    private AbstractBetSlip betSlip;

    public Punter(RaceCard raceCard, BetSlip betSlip) {
        this.raceCard = raceCard;
        this.betSlip = betSlip;
        raceCard.registerRaceCardObserver(this);
    }


    @Override
    public void updateRaceCardObserver(String raceName, String first, String second, String third) {
        System.out.println("the results of the " + raceName + " were:"
                + "\nWinner - " + first
                + "\nSecond Place - " + second
                + "\nThird Place - " + third);
    }
}
