package Lab3;

import javax.swing.*;

/**
 * Created by t00190804 on 18/10/2017.
 */
public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal() {
        this("Unknown", null, 0.0, 0);
    }

    public Animal(String type, String[] continents, double weight, int age) {
        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContinents() {
        return continents;
    }

    public void setContinents() {
        int numContinents = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of continents: "));
        continents = new String[numContinents];
        for(int i = 0; i < numContinents; i++) {
            continents[i] = JOptionPane.showInputDialog("Please enter the continent: ");
        }
            this.continents = continents;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Type: " + getType() + "\nContinents: " + getContinents() + "\nWeight: " + getWeight() + "\nAge: " + getAge();
    }
}
