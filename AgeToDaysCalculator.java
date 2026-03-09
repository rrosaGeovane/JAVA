import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculate your age in days");
        
        System.out.print("Enter your age in years: ");
        int years = sc.nextInt();
        
        System.out.print("Enter additional months: ");
        int months = sc.nextInt();
        
        System.out.print("Enter additional days: ");
        int days = sc.nextInt();
        
        int totalDays = days + (months * 30) + (years * 365);
        System.out.printf("You have lived %d day(s)", totalDays);
    }
}
