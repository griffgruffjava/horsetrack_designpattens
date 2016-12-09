import java.time.LocalDate;
import java.util.List;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class RaceCard {

    private final LocalDate date;
    private final String venue;
    private final List<AbstractRace> races;
    private final Stables stables;


    private RaceCard(RaceCardBuilder raceCardBuilder) {
        this.date = raceCardBuilder.date;
        this.venue = raceCardBuilder.venue;
        this.races = raceCardBuilder.races;
        this.stables = raceCardBuilder.stables;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public List<AbstractRace> getRaces() {
        return races;
    }

    public Stables getStables() {
        return stables;
    }

    public String toString() {
        String result = "Race Card details";
        if (date != null) {
            result += "\nDate: " + date;
        }
        if (venue != null) {
            result += "\nVenue: " + venue;
        }
        if (races != null) {
            result += "\nRace Details:";
            for (AbstractRace race : races) {
                result += "\n" + race.toString();
            }
        }
        if (stables != null) {
            result += "\n" + stables.toString();
        }
        return result;
    }

    public static class RaceCardBuilder {
        private LocalDate date;
        private String venue;
        private List<AbstractRace> races;
        private Stables stables;

        public RaceCardBuilder() {
        }

        public RaceCardBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public RaceCardBuilder venue(String venue) {
            this.venue = venue;
            return this;
        }

        public RaceCardBuilder races(List<AbstractRace> races) {
            this.races = races;
            return this;
        }

        public RaceCardBuilder stables(Stables stables) {
            this.stables = stables;
            return this;
        }

        public RaceCard build() {
            return new RaceCard(this);
        }
    }
}
