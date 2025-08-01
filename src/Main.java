import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add Item");

        System.out.print("Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Item Price: ");
        int price = scanner.nextInt();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        int addup = price * quantity;

        System.out.println("\nItem List");
        System.out.println("Product: " + name);
        System.out.println("Total Price: " + addup);

        scanner.close();
    }
}
