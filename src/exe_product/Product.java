package exe_product;

public class Product {
    private String name;
    private double price;
    private int qtde;

    public Product() {

    }

    public Product(String name, double price, int qtde) {
        this.name = name;
        this.price = price;
        this.qtde = qtde;
    }

    public double calculateTotalPrice(){
        double total = price * qtde;
        return total;
    }

    public void verifyStorage(){
        if(qtde > 1){
            System.out.println("Is available in stock");
        }else {
            System.out.println("Not available in stock");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtde() {
        return qtde;
    }
}
