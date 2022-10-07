public class AccountingFormatter implements NumberFormatter {

    public String format(int n){
    if (n < 0) {
        return String.format("(%d)", -n);
    }
        return String.format ("%d" , n );

    }
}