/**
 * Created by t00175569 on 09/12/2016.
 */
public class SingletonDriver {
    public static void main(String[] args) {
        //Declare first instance of stables
        Stables stablesOne = Stables.getInstance();
        Horse h1 = new Horse("Prancer");
        Horse h2 = new Horse("Dancer");
        Horse h3 = new Horse("Slow Poke");
        Horse h4 = new Horse("Gluey");

        stablesOne.addHorse(h1);
        stablesOne.addHorse(h2);
        stablesOne.addHorse(h3);
        stablesOne.addHorse(h4);
        stablesOne.removeHorse(h1.getName());
        stablesOne.removeHorse(h1.getName());

        //Show what horses are in first stables
        System.out.println(stablesOne.toString());

        //Declare second instance of stables
        Stables stablesTwo = Stables.getInstance();

        //Show that the same horses are in the second stables therefore same stables
        System.out.println(stablesTwo.toString());
    }
}
