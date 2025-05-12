public class StoreItem {
    private String name;
    private int productNum;
    private double price;
    private int quantity;

    public StoreItem(String name, int productNum, double price, int quantity) {
        this.name = name;
        this.productNum = productNum;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNum() {
        return productNum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String val) {
        name = val;
    }

    public void setProductNum(int val) {
        productNum = val;
    }

    public void setPrice(double val) {
        price = val;
    }

    public void setQuantity(int val) {
        quantity = val;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%d\t\t$%3.2f\t\t%d", name, productNum, price, quantity);
    }
}
