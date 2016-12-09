
public class SteepleRace extends AbstractRace {

    private int numOfJumps;

    public SteepleRace(String name, double furlongs, String ground, int numOfJumps) {
        setName(name);
        setFurlongs(furlongs);
        setGroundCondition(ground);
        setRaceType("Steeple Race");
        this.numOfJumps = numOfJumps;
    }

    public int getNumOfJumps() {
        return numOfJumps;
    }

    public void setNumOfJumps(int numOfJumps) {
        this.numOfJumps = numOfJumps;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumber of jumps = " + getNumOfJumps();
    }
}
