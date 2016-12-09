/**
 * Created by t00175569 on 09/12/2016.
 */
public interface RaceSubject {

    void registerRaceObserver(RaceObserver raceObserver);
    void removeRaceObserver(RaceObserver raceObserver);
    void notifyRaceObservers();
}
