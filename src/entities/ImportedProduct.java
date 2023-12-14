package entities;

public final class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return this.customsFee + this.getPrice();
    }

    @Override
    public String priceTag() {
        StringBuilder customFeeString = new StringBuilder();
        customFeeString.append(this.getName()).append(" $ ").append(this.totalPrice());
        customFeeString.append(" (Custom fee: $ ").append(customsFee).append(")");
        return customFeeString.toString();
    }
}
