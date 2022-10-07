
// Header
public class AccountingFormatter implements NumberFormatter {
    /**
     *
     * @param n integer/number that will need to be formatted
     * @return if number is positive return it as a string and if number is negative wrap the number in parenthesis
     */
    public String format(int n){
    if (n < 0) {
        return String.format("(%d)", -n);
    }
        return String.format ("%d" , n );

    }
}