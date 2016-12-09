
public interface RaceSubject {

    void registerRaceObserver(RaceObserver raceObserver);
    void removeRaceObserver(RaceObserver raceObserver);
    void notifyRaceObservers();
}
