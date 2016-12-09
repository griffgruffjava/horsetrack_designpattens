/**
 * Created by t00175569 on 09/12/2016.
 */
public interface RaceCardSubject {

    void registerRaceCardObserver(RaceCardObserver raceObserver);
    void removeRaceCardObserver(RaceCardObserver raceObserver);
    void notifyRaceCardObservers();
}

