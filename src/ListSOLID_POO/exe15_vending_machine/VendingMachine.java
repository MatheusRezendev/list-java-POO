package ListSOLID_POO.exe15_vending_machine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private double moneyInsert;

    public VendingMachine() {
        products = new ArrayList<>();
        moneyInsert = 0;
    }

    public void addProduct(String name, double price, int stock) {
        products.add(new Product(name, price, stock));
        System.out.println("Added product: " + name);
    }

    public void displayStock(){
        System.out.println("Stock available: ");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ": "+ product.getName() + ": $" + product.getPrice() + " Stock: " + product.getStock());
        }
    }

    public void selectProduct(int index) {
        if(index < 0 || index >= products.size()){
            System.out.println("Invalid product");
            return;
        }

        Product productSelect = products.get(index);
        if(productSelect.getStock() == 0){
            System.out.println("No stock available");
            return;
        }

        if(moneyInsert < productSelect.getPrice()){
            System.out.println("Not enough money");
            return;
        }

        productSelect.sell();
        double moneyRest = moneyInsert - productSelect.getPrice();
        moneyInsert = 0;
        System.out.println("Product purchased: " + productSelect.getName());
        System.out.println("Rest of money:" + moneyRest);
    }

    public void insertMoney(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        moneyInsert += amount;
        System.out.println("Money inserted: $" + moneyInsert);
    }
}
