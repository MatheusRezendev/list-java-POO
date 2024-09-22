package ListSOLID_POO.exe6_product;

import java.util.Scanner;

public class InputProduct {

    Scanner sc = new Scanner(System.in);
    ProductController pc = new ProductController();

    public void inputProduct(Product p) {
        System.out.println("Enter product name: ");
        p.setName(sc.next());

        System.out.println("Enter product price: ");
        p.setPrice(sc.nextDouble());

        System.out.println("Enter product quantity: ");
        p.setQtde(sc.nextInt());

        System.out.println("The total price is: " + String.valueOf(pc.calculateTotalPrice(p)));
        pc.verifyStorage(p);
    }
}
