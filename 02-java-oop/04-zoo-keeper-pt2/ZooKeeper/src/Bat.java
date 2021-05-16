import javax.swing.text.FlowView.FlowStrategy;

public class Bat extends Mammal {

    //constructor
    public Bat(int energyLevel){
        super(300);
    }

    //methods

    public void Fly(){
        System.out.println("on to the next town");
        energyLevel = energyLevel- 50;

    }
    
    public void eatHumans(){
        System.out.println("Feasted");
        energyLevel = energyLevel + 25;

    }

    public void attackTown(){
        System.out.println("Time to feast");
        energyLevel = energyLevel- 100;

    }
}
