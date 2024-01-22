package services;

public class PayPalService implements TaxService {
    @Override
    public double Tax(double amount) {
        return (amount / 100) * 2;
    }

    @Override
    public double SimpleInterest(double amount) {
        return (amount / 100) * 1;
    }
}