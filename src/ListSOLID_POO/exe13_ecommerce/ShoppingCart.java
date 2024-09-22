package ListSOLID_POO.exe13_ecommerce;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        if(product.isInStock(quantity)){
            items.put(product, items.getOrDefault(product, 0) + quantity);
            product.reduceStock(quantity);
            System.out.println(quantity + ": " + product.getName() + " added to the shopping cart.");
        } else {
            System.out.println("Insufficient stock for: " + product.getName());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getValue() * entry.getKey().getPrice();
        }
        return total;
    }

    public void applyDiscount(double discountPercentage){
        double total = calculateTotal();
        double discountAmount = total * (discountPercentage/100);
        double newTotal = total - discountAmount;
        System.out.println("Discount applied: " + discountPercentage + "%");
        System.out.println("total after discount: " + newTotal);
    }

    public void showCart(){
        System.out.println("Shopping cart: ");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}






