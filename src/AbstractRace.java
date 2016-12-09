import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public abstract class AbstractRace implements RaceSubject {

    private String name;
    private double furlongs;
    private String groundCondition;
    private String raceType;
    private Set<Horse> horses;

    private boolean isFinished;

    private List<RaceObserver> raceObservers;
    private String winner;
    private String second;
    private String third;

    public AbstractRace(){
        raceObservers = new ArrayList<>();
        isFinished = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFurlongs() {
        return furlongs;
    }

    public void setFurlongs(double furlongs) {
        this.furlongs = furlongs;
    }

    public String getGroundCondition() {
        return groundCondition;
    }

    public void setGroundCondition(String groundCondition) {
        this.groundCondition = groundCondition;
    }

    public String getRaceType() {
        return raceType;
    }

    public void setRaceType(String raceType) {
        this.raceType = raceType;
    }

    public Set<Horse> getHorses() {
        return horses;
    }

    public void setHorses(Set<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public void registerRaceObserver(RaceObserver raceObserver) {
        raceObservers.add(raceObserver);
    }

    @Override
    public void removeRaceObserver(RaceObserver raceObserver) {
        int i = raceObservers.indexOf(raceObserver);
        if (i >= 0) {
            raceObservers.remove(i);
        }
    }

    @Override
    public void notifyRaceObservers() {
        for (RaceObserver raceObserver : raceObservers) {
            raceObserver.updateRaceObserver(name, winner, second, third);
        }
    }

    public void setResults(String winner, String second, String third) {
        this.winner = winner;
        this.second = second;
        this.third = third;
        this.isFinished = true;
        notifyRaceObservers();
    }


    public String toString() {
        String card = "\nThis is the " + getName() + " " + getRaceType()
                + "\nlength = " + getFurlongs() + " furlongs"
                + "\nground condition = " + getGroundCondition();

        if(!isFinished) {
            if (null != horses) {
                card += "\nHorses running:";
                for (Horse h : horses) {
                    card += "\n-" + h.getName();
                }
            } else {
                card += "\nNo Horses registered for this race yet";
            }
        }else {
            card += "\nThe results are: "
                    +"\nWinner " + winner
                    +"\nSecond " + second
                    +"\nThird " + third;
        }


        return card;
    }
}
