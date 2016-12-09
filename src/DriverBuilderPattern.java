import java.time.LocalDate;


public class DriverBuilderPattern {

    public static void main(String[] args) {

        RaceCard raceCard1 = new RaceCard.RaceCardBuilder().date(LocalDate.now()).build();
        System.out.println(raceCard1.toString()+"\n");


        Stables stables = Stables.getInstance();
        String venue = "Tralee Race Track";

        RaceCard raceCard2 = new RaceCard.RaceCardBuilder().date(LocalDate.now()).venue(venue).stables(stables).build();
        System.out.println(raceCard2.toString());
    }
}
