package Lab4;

/**
 * Created by CianC on 18/10/2017.
 */
public class Person {
    private String name;

    public Person() {
        this("Bob");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "" + getName();
    }
}
