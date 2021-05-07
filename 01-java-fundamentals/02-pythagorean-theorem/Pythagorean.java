import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double i = (legA * legA) + (legB * legB);
        double Answer = Math.sqrt(i);
        return Answer;
    }
}
