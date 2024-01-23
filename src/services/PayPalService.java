package services;

public class PayPalService implements TaxService {
    private String simpleInterest = "1%";
    private String paymantTax = "2%";

    public String getSimpleInterest() {
        return simpleInterest;
    }

    public String getPaymantTax() {
        return paymantTax;
    }

    @Override
    public double calculateTax(double parcelPrice) {
        double withSimpleInterest = parcelPrice + ((parcelPrice / 100) * 1);
        double paymantTax = withSimpleInterest + ((withSimpleInterest / 100) * 2);

        return paymantTax;
    }
}