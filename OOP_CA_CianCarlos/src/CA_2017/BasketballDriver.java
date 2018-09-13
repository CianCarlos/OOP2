package CA_2017;

import javax.swing.*;

public class BasketballDriver {
    public static void main(String[]args) {
        String name;
        int age;
        double height;
        Basketballer basketballer = null;
        Basketballer basketballer1 = new Basketballer();

        Basketballer[] team = new Basketballer[1];

        int i;
        for (i = 0; i < 1; i++) {
            name = JOptionPane.showInputDialog("Enter Basketballers name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter Basketballers age: "));
            height = Double.parseDouble(JOptionPane.showInputDialog("Enter Basketballers Height: "));
            team[i] = new Basketballer(name, age, height);
            team[i] = basketballer;
        }

        JTextArea display = new JTextArea();
        for(i=0; i<5; i++){
            display.append(team[i].toString());
        }


        JOptionPane.showMessageDialog(null, display);
    }

    public double tallestPlayer(double getHeight){
        double tallest=0;
        if(getHeight>tallest){
            getHeight=tallest;
        }
        return getHeight;
    }

    public String displayTeam(String name, int age, double height, double feet){
        return "Team:\n\nName: " + name + "\nAge: " + age + " years old\n" + "Name: " + feet + " ft\n\n";
    }
}