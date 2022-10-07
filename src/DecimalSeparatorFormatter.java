
public class DecimalSeparatorFormatter implements NumberFormatter {
    /**
     *
     * @param n is the number to be formatted
     * @return number seperated by commas
     *
     */
    public String format(int n) {
        return String.format("%,d",n);
    }
}


