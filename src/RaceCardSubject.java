/**
 * Created by t00175569 on 09/12/2016.
 */
public interface RaceCardSubject {

    void registerObserver(RaceCardObserver raceObserver);
    void removeObserver(RaceCardObserver raceObserver);
    void notifyObservers();
}
