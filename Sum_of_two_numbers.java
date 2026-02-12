import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        sum = num1 + num2;
        System.out.printf("The sum of the two numbers is: %.2f\n", sum);
        sc.close();
    }
}
