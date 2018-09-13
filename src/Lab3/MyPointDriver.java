package Lab3;

import javax.swing.*;

/**
 * Created by t00190804 on 18/10/2017.
 */
public class MyPointDriver {
    public static void main(String[]args)
    {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(5,8);
        JOptionPane.showMessageDialog(null, point1.toString());
        JOptionPane.showMessageDialog(null, point2.toString());
    }
}
