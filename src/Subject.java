/**
 * Created by t00175569 on 09/12/2016.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
