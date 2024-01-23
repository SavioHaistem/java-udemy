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
        double parcelValue = taxService.calculateTax((contract.getValue() / parcelQuantity));

        for (int count = 0; count < parcelQuantity; count++) {
            LocalDate parcelDate = contract.getDate().plusMonths((count + 1));
            contract.addParcel(new Parcel(parcelValue,parcelDate));
        }
    }
}
