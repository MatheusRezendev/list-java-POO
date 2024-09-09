package exe_product;

public class Main {
    public static void main(String[] args) {

        Product p = new Product("Cheese", 35, 4);

        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQtde());

        System.out.println("The total price is: " + p.calculateTotalPrice());
        p.verifyStorage();
    }
}