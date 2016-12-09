import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class RaceCard implements RaceCardSubject, RaceObserver {

    private final LocalDate date;
    private final String venue;
    private final List<AbstractRace> races;
    private final Stables stables;

    private List<RaceCardObserver> raceCardObservers;
    private String raceName;
    private String winner;
    private String second;
    private String third;


    private RaceCard(RaceCardBuilder raceCardBuilder) {
        this.date = raceCardBuilder.date;
        this.venue = raceCardBuilder.venue;
        this.races = raceCardBuilder.races;
        this.stables = raceCardBuilder.stables;
        raceCardObservers = new ArrayList<>();
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

    @Override
    public void registerRaceCardObserver(RaceCardObserver raceCardObserver) {
        raceCardObservers.add(raceCardObserver);
    }

    @Override
    public void removeRaceCardObserver(RaceCardObserver raceCardObserver) {
        int i = raceCardObservers.indexOf(raceCardObserver);
        if (i >= 0) {
            raceCardObservers.remove(i);
        }
    }

    @Override
    public void notifyRaceCardObservers() {
        for (RaceCardObserver raceCardObserver : raceCardObservers) {
            raceCardObserver.updateRaceCardObserver(raceName, winner, second, third);
        }
    }

    public void setResults(String raceName, String winner, String second, String third) {
        System.out.println("Stop --- HERE I AM");
        this.raceName = raceName;
        this.winner = winner;
        this.second = second;
        this.third = third;
        notifyRaceCardObservers();
    }

    @Override
    public void updateRaceObserver(String raceName, String first, String second, String third) {
        setResults(raceName,first,second,third);
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
