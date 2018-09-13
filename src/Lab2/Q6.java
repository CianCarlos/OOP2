package Lab2;

/**
 * Created by CianC on 11/10/2017.
 */
public class Q6 {
    public static void main(String[]args)
    {
        int value=1;
        String answer = "Number\t\tCube\n" +
                "-----\t\t-----\n";

        while (value<=15) {
            answer += "  " + value + "\t\t\t" + cube(value) + "\n";
            value++;
        }

        System.out.println(answer);
    }

    public static int cube(int value)
    {
        int cube = value * value * value;

        return cube;
    }
}
