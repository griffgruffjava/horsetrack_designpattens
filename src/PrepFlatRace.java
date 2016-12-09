/**
 * Created by C_Train on 09/12/2016.
 */
public class PrepFlatRace extends PrepGrounds {

    boolean isRain;
    boolean isNight;

    public PrepFlatRace(boolean isRain, boolean isNight){
        this.isRain=isRain;
        this.isNight=isNight;
    }
    @Override
    void installJumps() {}

    boolean isNightTime(){return isNight;}

    boolean isRaining(){return isRain;}




}
