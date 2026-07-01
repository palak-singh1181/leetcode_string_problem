
public class Power {

    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }

            x *= x;
            power >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Power obj = new Power();

        System.out.println(obj.myPow(2.0, 10));
        System.out.println(obj.myPow(2.1, 3));
        System.out.println(obj.myPow(2.0, -2));
    }
}