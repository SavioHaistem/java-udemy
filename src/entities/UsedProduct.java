package entities;

import java.util.Date;

public final class UsedProduct extends Product {
    private Date manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate() {
        return this.manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag() {
        StringBuilder manufacturedDateString = new StringBuilder();
        manufacturedDateString.append(this.getName()).append(" (Used) $ ").append(this.getPrice());
        manufacturedDateString.append(" (Manufacture date: ").append(manufacturedDate).append(")");
        return manufacturedDateString.toString();
    }
}
