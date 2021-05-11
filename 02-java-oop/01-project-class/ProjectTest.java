public class ProjectTest {
    public static void main(String[] args) {
        Project Version1 = new Project();
        Project Version2 = new Project("Rocketlake");
        Project Version3 = new Project("RocketRiver", "gibberish", 1000);

        Version1.elevatorPitch();
        Version2.elevatorPitch();
        Version3.elevatorPitch();

        
    }
    
}
