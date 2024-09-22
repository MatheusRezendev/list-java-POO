package ListSOLID_POO.exe6_product;

public class ProductController {

    public double calculateTotalPrice(Product product){
        return product.getPrice() * product.getQtde();
    }

    public void verifyStorage(Product product){
        if(product.getQtde() > 1){
            System.out.println("Is available in stock");
        }else {
            System.out.println("Not available in stock");
        }
    }

}
