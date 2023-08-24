import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

    }

}

class ShoppingCart {
    ArrayList<String> shoppingCart;
    Scanner scanner;

    public ShoppingCart(ArrayList<String> shoppingCart, Scanner scanner) {
        this.shoppingCart = shoppingCart;
        this.scanner = scanner;
    }

    public void run() {

        while (true) {
            System.out.printf("1 - Add item");
            System.out.println("2 - Remove item");
            System.out.println("3 - Display items");
            System.out.println("4 - Exit\n");

            System.out.println("Select an opton from the menu:");

            int choice = Integer.valueOf(scanner.nextLine());
            
        }

    }



}
