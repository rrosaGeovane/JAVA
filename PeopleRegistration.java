```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String menu = """
                ------------------
                Registration
                ------------------
                1 - Add people
                2 - View registered people
                3 - Remove people
                4 - Exit
                """;

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int resp = 0;
        String n = "";

        while (true) {
            System.out.println(menu);
            System.out.println("Your option:");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Register person:");
                    sc.nextLine(); // Clear buffer
                    n = sc.nextLine();
                    names.add(n);
                    break;

                case 2:
                    System.out.println("Registered people:");
                    if (names.isEmpty()) {
                        System.out.println("The register has no records");
                    } else {
                        for (String name : names) {
                            System.out.println(name);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Remove people:");
                    sc.nextLine();
                    System.out.println("Type the person that will be removed.");
                    n = sc.nextLine();

                    if (names.isEmpty()) {
                        System.out.println("The register has no records");
                    } else if (names.remove(n)) {
                        System.out.println("Name: " + n + " removed successfully");
                    } else {
                        System.out.println("This name was not registered!");
                    }
                    break;

                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
```
