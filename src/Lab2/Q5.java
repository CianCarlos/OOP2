package Lab2;

import javax.swing.*;

import static java.lang.Math.sqrt;

/**
 * Created by t00190804 on 06/10/2017.
 */
public class Q5 {
    public static void main(String[]args)
    {
        float a=1f, b=6f, c=-16f, x, y;

        x = (float) ((-b + sqrt((Math.pow(b,2))-4f*a*c))/(2f*a));

        y = (float) ((-b - sqrt((Math.pow(b,2))-4f*a*c))/(2f*a));

        JOptionPane.showMessageDialog(null,"Solution is " + x + ", " + y,"Quadratic Equation",JOptionPane.INFORMATION_MESSAGE);
    }
}
