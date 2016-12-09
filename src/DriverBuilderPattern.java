import java.time.LocalDate;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class DriverBuilderPattern {

    public static void main(String[] args) {

        RaceCard raceCard = new RaceCard.RaceCardBuilder().date(LocalDate.now()).build();
        System.out.println(raceCard.toString());

    }
}
