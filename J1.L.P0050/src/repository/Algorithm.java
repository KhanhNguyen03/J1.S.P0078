
package repository;

import java.util.ArrayList;
import java.util.List;


public class Algorithm {


    public Algorithm() {
    }

    public double SuperlativeEquation(double a, double b) {
        return -b / a;
    }

    public double Delta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public boolean isOdd(double a){
        return a % 2 != 0;
    }
    public boolean isPerfect(double a){
        return Math.pow((int)Math.sqrt(a), 2) == a;
    }

}
