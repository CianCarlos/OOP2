package CA_2017;

public class Basketballer {
    private String name;
    private int age;
    private double height;

    public Basketballer() {
        this("Unknown", 0,0.0);
    }

    public Basketballer(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String toString() {
        return String.format("Name: " + getName() + "\nAge: " + getAge() + " years old\nHeight: " + getHeight() + " m\n\n");
    }
}
