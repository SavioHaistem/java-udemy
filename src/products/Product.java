package products;

public class Product {
    public String name;
    public Double price;
    public Integer quant;

    public double totalValueInStock() {
        return quant * price;
    }

    public void addProducts(int more) {
        this.quant += more;
    }

    public void removeProducts(int minus) {
        this.quant -= minus;
    }
}
