package ListSOLID_POO.exe6_product;

public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        ProductController pc = new ProductController();
        InputProduct i = new InputProduct();

        i.inputProduct(p);

        System.out.println("Product: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQtde());

    }
}