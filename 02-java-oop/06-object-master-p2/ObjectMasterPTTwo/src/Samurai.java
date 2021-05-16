public class Samurai extends Human {
    private static int numSamurai=0;

    public Samurai(){
        sethealth(200);
        numSamurai++;
    }
    
    //methods
    public int howMany(){
        return numSamurai;
    }

    public void DeathBlow(Human target){
        target.health=0;
        sethealth((health/2));
    }

    public void meditate(){
        sethealth(200);
    }
}
