package Lab3;

/**
 * Created by t00190804 on 18/10/2017.
 */
public class Bicycle {
    private String ownersName;
    private double value;
    private String make;

    public Bicycle() {
        this("Unknown", 0, "Unknown");
    }

    public Bicycle(String ownersName, double value, String make) {
        this.ownersName = ownersName;
        this.value = value;
        this.make = make;
    }

    public String getOwnersName() { return ownersName; }
    public void setOwnersName(String ownersName) { this.ownersName = ownersName; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String toString(){
        return "Owner: " + getOwnersName() + "\nValue: " + getValue() + "\nMake: " + getMake();
    }
}
