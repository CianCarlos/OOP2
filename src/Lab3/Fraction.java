package Lab3;

/**
 * Created by CianC on 18/10/2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this(0,1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() { return numerator; }
    public void setNumerator(int numerator) { this.numerator = numerator; }

    public int getDenominator() { return denominator; }
    public void setDenominator(int denominator) { this.denominator = denominator; }

    public Fraction addition(Fraction fract1) {
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()) + (getDenominator() * fract1.getDenominator()),
                getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction subtraction(Fraction fract1) {
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()) - (getDenominator() * fract1.getNumerator()),
                getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction multiplication(Fraction fract1) {
        Fraction answer = new Fraction((getNumerator() * fract1.getNumerator()), getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction division(Fraction fract1) {
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()), getDenominator() * fract1.getNumerator());
        return answer;
    }

    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }
}
