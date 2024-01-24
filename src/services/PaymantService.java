package services;
import entities.Contract;
import entities.Parcel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class PaymantService {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private TaxService taxService;

    public PaymantService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processParcels(Contract contract, Integer parcelQuantity) {
        double parcel = contract.getValue() / parcelQuantity;
        for (int count = 1; count <= parcelQuantity; count++) {
            double withInterest = parcel + taxService.simpleInterest(parcel,count);
            double parcelPrice = withInterest + taxService.paymantTax(withInterest);

            LocalDate parcelDate = contract.getDate().plusMonths((count));
            contract.addParcel(new Parcel(parcelPrice,parcelDate));
        }
    }
}
