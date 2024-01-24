package services;

public class PayPalService implements TaxService {

    @Override
    public double simpleInterest(double parcel, int monthly) {
        return (parcel / 100) * (1 * monthly);
    }

    @Override
    public double paymantTax(double parcel) {
        return (parcel / 100) * 2;
    }
}