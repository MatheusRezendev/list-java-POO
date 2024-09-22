package ListSOLID_POO.exe6_product;

public class Product {
    private String name;
    private double price;
    private int qtde;

    public Product() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public int getQtde() {
        return qtde;
    }
}
