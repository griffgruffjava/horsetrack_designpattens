

public class PrepSteepleRace extends PrepGrounds {
    boolean isRain;
    boolean isNight;

    public PrepSteepleRace(boolean isRain, boolean isNight){
        this.isRain=isRain;
        this.isNight=isNight;
    }
    @Override
    void installJumps() {
        System.out.println("The jumps are now being installed");
    }

    boolean isNightTime(){return isNight;}

    boolean isRaining(){return isRain;}


}
