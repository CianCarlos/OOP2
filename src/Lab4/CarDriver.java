package Lab4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CianC on 18/10/2017.
 */
public class CarDriver {
    public static void main(String[]args) {
        List<Car> catalog = new ArrayList<>();
        int numCars = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of cars: "));

        for (int i = 0; i < numCars; i++) {
            catalog.add(new Car(JOptionPane.showInputDialog("Enter a car: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Enter doors: ")),
                    Float.parseFloat(JOptionPane.showInputDialog("Enter speed: "))));
        }
        displayCar(catalog);
        //JOptionPane.showMessageDialog(null, car1.toString());
        //JOptionPane.showMessageDialog(null, car2.toString());
    }
        public static void displayCar(List<Car> catalog){
            JTextArea output = new JTextArea();
            for(Car car : catalog){
                output.append(car.toString());
            }
            output.append("Number of Cars: " + Car.getCounter() + "\n\n");
            JOptionPane.showMessageDialog(null, output);
    }
}