package ListSOLID_POO.exe13_ecommerce;

public class Main {
    public static void main(String[] args) {

        Ecommerce e = new Ecommerce();

        e.addProductToPlatform("Alexa", 250.0, 10);
        e.addProductToPlatform("Mouse", 120.0, 45);

        e.addToCart("Alexa", 2);
        e.addToCart("Mouse", 1);

        e.showCart();

        e.calculateTotalPrice();

        e.applyDiscount(10);
    }
}