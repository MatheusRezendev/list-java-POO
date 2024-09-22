package ListSOLID_POO.exe13_ecommerce;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public boolean isInStock(int quantity) {
        return this.stock >= quantity;
    }
}
