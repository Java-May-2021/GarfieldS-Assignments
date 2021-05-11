public class Project {
    //varriables
    private String name;
    private String description;
    private double cost;
    
    //Constructors
    public Project() {}

    public Project(String name) {
        this.name=name;
    }

    public Project(String name, String description, double cost) {
        this.name=name;
        this.description=description;
        this.cost=cost;
    }
    
    //setter
    public void setProjectName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setCost(double cost){
        this.cost=cost;
    }

    //Getter

    public String getProjectName(){
        return name;
    }

    public String getProjectDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

    // Methods

    public void elevatorPitch(){
        System.out.println(name + "("+cost+")"+ ": "+ description);
    }


   
}//enb
