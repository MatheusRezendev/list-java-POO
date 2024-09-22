package ListSOLID_POO.exe15_vending_machine;

public class Main {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        InputVendingMachine i = new InputVendingMachine();

        vm.addProduct("cookie", 4.5, 7);
        vm.addProduct("juice", 5, 15);

        boolean running = true;
        while (running) {
            System.out.println("Choose one option: ");
            System.out.println("\n1 - Display stock");
            System.out.println("\n2 - Insert money");
            System.out.println("\n3 - Select product");
            System.out.println("\n4 - Exit ");

            int op = i.getInt("Insert your choose:");

            switch (op) {
                case 1:
                    vm.displayStock();
                    break;
                case 2:
                    double amount = i.getDouble("Enter the value do you want to add: ");
                    vm.insertMoney(amount);
                    break;
                case 3:
                    int product = i.getInt("Enter the number of the product you wish to purchase: ");
                    vm.selectProduct(product);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }
        i.close();
    }
}