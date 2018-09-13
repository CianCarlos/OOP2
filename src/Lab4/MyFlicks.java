package Lab4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CianC on 18/10/2017.
 */
public class MyFlicks {
    public static void main(String[]args){
        String title;
        String director;
        int duration;
        Film film;

        int numOfFilms = Integer.parseInt(JOptionPane.showInputDialog("Enter number of films: "));

        Film[] films = new Film[numOfFilms];

        for(int i=0;i<numOfFilms;i++){
            title=JOptionPane.showInputDialog("Enter film title: ");
            director=JOptionPane.showInputDialog("Enter director: ");
            duration=Integer.parseInt(JOptionPane.showInputDialog("Enter film duration: ")) ;
            film = new Film(title, director, duration);
            films[i]=film;
        }
        JTextArea output = new JTextArea("Number of Films: " + Film.getCounter() + "\n\n");
        for(int i=0;i<numOfFilms;i++){
            output.append(films[i].toString());
        }

        JOptionPane.showMessageDialog(null, output);
    }
}