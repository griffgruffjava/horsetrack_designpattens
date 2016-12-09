

public class DriverTemplatePattern {
    public static void main(String[] args) {
        PrepSteepleRace steepleRace = new PrepSteepleRace(true,false);
        PrepFlatRace flatRace = new PrepFlatRace(false,false);
        PrepFlatRace flatRace2 = new PrepFlatRace(true,true);

        steepleRace.prepReciepe();
        System.out.println();
        flatRace.prepReciepe();
        System.out.println();
        flatRace2.prepReciepe();
    }
}
