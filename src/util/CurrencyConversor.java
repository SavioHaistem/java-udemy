package util;

public class CurrencyConversor {
    public static int IOF = 6;
    public static double iof(double liquid) {
        return (liquid / 100) * IOF;
    }
    public static double calculate(Double quantity, Double currencyPrice) {
        return currencyPrice * quantity + iof(currencyPrice * quantity);
    }
}
