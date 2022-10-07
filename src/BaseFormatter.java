public class BaseFormatter implements NumberFormatter {

    public String format (int n)
    {
        return Integer.toString(n,base);
    }

    int base;
    public BaseFormatter (int b)
    {
        base = b;
        if ( base < 2 || base > 36 )
            base = 2;


    }
}
