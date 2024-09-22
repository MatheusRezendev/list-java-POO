package ListSOLID_POO.exe13_ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    private List<Product> products;
    private ShoppingCart cart;

    public Ecommerce() {
        this.products = new ArrayList<>();
        this.cart = new ShoppingCart();
    }

    public void addProductToPlatform(String name, double price, int stock) {
        Product newProduct = new Product(name, price, stock);
        products.add(newProduct);
        System.out.println("Product " + name + " added to platform");
    }

    public void addToCart(String name, int quantity) {
        Product product = searchProductByName(name);
        if (product != null) {
            cart.addItem(product, quantity);
        } else {
            System.out.println("Product " + name + " not found");
        }
    }

    public void applyDiscount(double discountPercentage){
        cart.applyDiscount(discountPercentage);
    }

    public void calculateTotalPrice() {
        double totalPrice = cart.calculateTotal();
        System.out.println("Total price before discount: " + totalPrice);
    }

    public void showCart(){
        cart.showCart();
    }

    public Product searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
