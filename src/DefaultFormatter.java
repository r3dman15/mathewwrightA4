
public class DefaultFormatter implements NumberFormatter {
    /**
     *
     * @param n int/number to be formated
     * @return the number formatted to a string unchanged
     */
    public String format ( int n){
        return Integer.toString(n);
    }

}
