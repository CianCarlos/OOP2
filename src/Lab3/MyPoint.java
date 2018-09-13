package Lab3;

/**
 * Created by t00190804 on 18/10/2017.
 */
public class MyPoint {
    private int xVal;
    private int yVal;

    public MyPoint() {
        xVal = 0;
        yVal = 0;
    }

    public MyPoint(int xVal, int yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public double getXVal() {
        return xVal;
    }
    public void setXVal(int xVal) {
        this.xVal = xVal;
    }

    public double getYVal() {
        return yVal;
    }
    public void setYVal(int yVal) {
        this.yVal = yVal;
    }

    public void translate(int xVal, int yVal){
        double newXVal = getXVal() + xVal;
        double newYVal = getYVal() + yVal;
    }

    public String distanceFromOrigin(){
        double firstValue = 0 - getXVal();
        double secondValue = 0 - getYVal();
        return "(" + firstValue + ", " + secondValue + ")";
    }
    public String toString() {
        return "X Value: " + getXVal() + "\nY Value: " + getYVal();
    }
}
