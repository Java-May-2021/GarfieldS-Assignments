public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override 
    public String ring() {
        return "iphone "+ getversionNumber()+ " says "+ getringTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via Facial recgnition";
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone "+ getversionNumber() +" from "+ getcarrier());          
    }
}