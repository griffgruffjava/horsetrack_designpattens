/**
 * Created by C_Train on 09/12/2016.
 */
public class DriverTemplatePattern {
    public static void main(String[] args) {
        PrepSteepleRace steepleRace = new PrepSteepleRace(true,false);
        PrepFlatRace flatRace = new PrepFlatRace(false,false);
        PrepFlatRace flatRace2 = new PrepFlatRace(true,true);

        steepleRace.prepReciepe();
        flatRace.prepReciepe();
        flatRace2.prepReciepe();
    }
}
