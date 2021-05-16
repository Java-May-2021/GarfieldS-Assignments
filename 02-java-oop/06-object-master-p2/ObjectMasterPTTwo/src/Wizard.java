public class Wizard extends Human {

    //
    public Wizard(){
        this.health=50;
        this.intelligence=8;
    }

    //methods

    public void heal(Human Target){
        Target.health= Target.health+getIntelligence();
    }

    public void fireball(Human target){
        target.health=target.health-(getIntelligence()*3);
    }
    
}
