
package jobsheetfunction2;
import java.util.Scanner;

public class jobsheetfunction4 {
    public static void lakukan (double a, double b){
        System.out.println("Kecepatannya yaitu :" +(a / b)+"Km/jam");
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jaraknya berapa : ");
        int jarak = input.nextInt();
        
        System.out.println("Waktunya berapa : ");
        int waktu = input.nextInt();
        
        lakukan(jarak,waktu);
    }
    
    
    
        
    
}
