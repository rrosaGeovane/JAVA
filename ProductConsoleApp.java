import java.util.Locale;
import java.util.Scanner;

class Product {
    String name;
    float price;
    int quantity;

    Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void formattedPrice() {
        System.out.printf(Locale.US, "%.2f\n", price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter product name:");
        String productName = sc.nextLine();

        System.out.println("Enter product price:");
        float productPrice = sc.nextFloat();

        System.out.println("Enter product quantity:");
        int productQuantity = sc.nextInt();

        Product p1 = new Product(productName, productPrice, productQuantity);
        p1.formattedPrice();

        sc.close();
    }
}
