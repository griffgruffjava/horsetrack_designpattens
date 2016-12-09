import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by t00175569 on 09/12/2016.
 */
public class RunRace {

    public static AbstractRace runIt(AbstractRace race) {
        race.setResults("SomeHorse","Another","thisGuy");
        return race;
    }

    public Set pickThree(int size){
        Set nums = new TreeSet();
        while(nums.size()>3) {
            int randomNum = ((int)(Math.random()*size))+1;
            nums.add(randomNum);
        }
        return nums;
    }
}
