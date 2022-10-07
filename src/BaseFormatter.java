//
public class BaseFormatter implements NumberFormatter {
// private field base for number to be formated against
    private int b;
// constructor that accepts a base number

    /**
     *
     * @param b // private field base for number to be formated against
     */
    public BaseFormatter(int b) {
       // initializing base number based on input
        this.b = (b < 2 || b > 36 ) ? 2 : b;
    }

    /**
     *
     * @param n
     * @return
     */
    public String format(int n) {
        return Integer.toString(n, b);
    }
}
