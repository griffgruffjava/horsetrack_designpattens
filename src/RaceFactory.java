

public class RaceFactory {


    public AbstractRace createRace(String name, double furlongs, String ground) {
        return new FlatRace(name,furlongs,ground);
    }

    public AbstractRace createRace(String name, double furlongs, String ground, int jumps) {
        return new SteepleRace(name,furlongs,ground,jumps);
    }

}
