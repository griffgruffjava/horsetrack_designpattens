/**
 * Created by t00175569 on 09/12/2016.
 */
public class Punter implements Observer {

    private AbstractRace race;

    public Punter(AbstractRace race){
        this.race = race;
        race.registerObserver(this);
    }



    @Override
    public void update(String first, String second, String third) {
        System.out.println("the results of the " + race.getName() +" were:"
                +"\nWinner - " + first
                +"\nSecond Place - " +second
                +"\nThird Place - " + third);
    }
}
