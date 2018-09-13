package Lab4;

/**
 * Created by CianC on 18/10/2017.
 */
public class Car {
    private String make;
    private int doors;
    private float maxSpeed;
    private static int counter;

    public Car() {
        this("Unknown", 0, 0);
    }

    public Car(String make, int doors, float maxSpeed) {
        this.make = make;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
        counter++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }

    public String toString() {
        return "Make: " + getMake() + "\nNo of Doors: " + getDoors() + "\nMax Speed: " + getMaxSpeed() + " mph\n\n";
    }
}
