/**
 * Created by t00175569 on 09/12/2016.
 */
public interface RaceSubject {

    void registerObserver(RaceObserver raceObserver);
    void removeObserver(RaceObserver raceObserver);
    void notifyObservers();
}
