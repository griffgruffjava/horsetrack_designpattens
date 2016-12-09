import java.util.ArrayList;
import java.util.List;


public class FlatRace extends AbstractRace {

    public FlatRace(String name, double furlongs, String groundCondition) {
        setName(name);
        setFurlongs(furlongs);
        setGroundCondition(groundCondition);
        setRaceType("Flat Race");
    }

}
