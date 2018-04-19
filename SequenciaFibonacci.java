
package sequenciafibonacci;
import java.util.Scanner;
public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner dados=new Scanner(System.in);
        int num1 = 1, num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 30; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }}
    
        