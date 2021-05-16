public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself

    //getters

    public String getversionNumber(){
        return versionNumber;
    }
    public int getbatteryPercentage (){
        return batteryPercentage;
    }
    public String getcarrier(){
        return carrier;
    }
    public String getringTone(){
        return ringTone;
    }

    //setters

    protected void setversionNumber(String versionNumber){
        this.versionNumber=versionNumber;
    }
    protected void setbatteryPercentage(int batteryPercentage){
        this.batteryPercentage=batteryPercentage;
    }
    protected void setcarrier(String carrier){
        this.carrier=carrier;
    }
    protected void setringtone(String ringTone){
        this.ringTone=ringTone;
    }
}