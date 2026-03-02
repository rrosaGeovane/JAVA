//Read 10 numbers and state the position of the largest value.
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[] num = new double[10];
        double max = 0;
        int indice_max = 0;
        
        
        for(int i=0; i<10; i++){
            num[i] = sc.nextDouble();
            if (i==0){
                max = num[i];
                indice_max = i;
            }
            else if (num[i]>max){
                max = num[i];
                indice_max = i;
            }
        }
        System.out.printf("The largest number is in index %d", indice_max+1);
        
    }
}
