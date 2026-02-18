import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi >= 40) {
            System.out.println("Severe Obesity");
        } else if (bmi >= 30) {
            System.out.println("Obesity");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }

        sc.close();
    }
}
