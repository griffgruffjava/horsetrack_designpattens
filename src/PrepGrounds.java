

public abstract class PrepGrounds {

    void prepReciepe(){

        cutGrass();
        if(isNightTime()){
            turnOnSpotLights();
        }
        if(isRaining()){
            extendAwning();
        }
        installJumps();

        openGates();
    }

    void cutGrass(){
        System.out.println("Cutting the Grass");
    }

    void turnOnSpotLights(){
        System.out.println("The spot lights are now on");
    }

    void extendAwning(){
        System.out.println("Extending the rain awning");
    }

    abstract void installJumps();

    void openGates(){
        System.out.println("The grounds are now Open");
    }

    boolean isNightTime(){return false;}

    boolean isRaining(){return false;}
}
