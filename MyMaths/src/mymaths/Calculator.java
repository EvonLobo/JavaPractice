package mymaths;

/**
 *
 * @author evonl
 */
import java.lang.Math;
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int y, int z) {
        return y - z;
    }

    public int multiply(int d, int e) {
        return d * e;
    }

    public double divide(double g, double h) {
        return g / h;
    }

    public int min(int x, int y) {

        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public int max(int u, int i) {
        if (u > i) {
            return u;
        } else {
            return i;
        }
    }

    public int absolute(int e) {
        if (e < 0) {
            return e * -1;
        } else {
            return e;

        }
    }
}
