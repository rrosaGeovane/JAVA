import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int size = 5;
	    String[] names = new String[size];
	    
		System.out.println("Type 5 names: ");
		
		for(int i = 0; i<size; i++){
		    System.out.printf("Enter the %dº name: \n", i+1);
		    names[i] = sc.nextLine();
		}
		System.out.println("\nNames entered by the user:");
		for(int i = 0; i<size; i++){
		    System.out.println(names[i]);
		}
		sc.close();
		
	}
}
