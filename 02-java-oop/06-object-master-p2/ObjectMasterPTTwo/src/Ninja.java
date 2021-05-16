public class Ninja extends Human {

    public Ninja(){
        setStealth(10);
    }

    //methods

    public void steal(Human Target){
        Target.health= Target.health-getStealth();
        sethealth((getHealth()+getStealth()));
    }

    public void RunAway(){
        sethealth(getHealth()-10);
    }
    
}
