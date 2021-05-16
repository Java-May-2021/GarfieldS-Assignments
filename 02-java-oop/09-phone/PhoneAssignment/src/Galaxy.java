public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Galaxy "+ getversionNumber()+ " says "+ getringTone();
    }
    @Override
    public String unlock() {
        return "unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy "+ getversionNumber() +" from "+ getcarrier());
    } 
}