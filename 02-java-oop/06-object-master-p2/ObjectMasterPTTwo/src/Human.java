public class Human {
    // Stats
    protected int strength=3;
    protected int intelligence=3;
    protected int stealth=3;
    protected int health=100;
    
    //setters
    public void setStrength(int strength){
        this.strength=strength;
    }
    public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
    }
    public void setStealth(int stealth){
        this.stealth=stealth;
    }
    public void sethealth(int health){
        this.health=health;
    }
    
    
    //getters
    public int getStrength(){
        return strength;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getStealth(){
        return stealth;
    }
    public int getHealth(){
        return health;
    }
    
    
    //methods
    public void attack(Human target){
        target.health=target.health-strength;
        System.out.println("ive been hit");
    }
        
    }//end
    