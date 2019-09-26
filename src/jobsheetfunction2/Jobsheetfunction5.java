
package jobsheetfunction2;

import java.util.Scanner;

public class Jobsheetfunction5 {

    public static void hasil(int a, int b, int c) {
        if(a > b && a > c){
            System.out.println("nilai terbesar adalah" +a);  
        }
        else if(b > a && b > c){
            System.out.println("nilai terbesar adalah?" +b);
        }
        else if(c > a && c > b){
            System.out.println("nilai terbesar adalah" +c);
        }
    }
    public static void main(String[] args){
        Scanner mahal = new Scanner(System.in);
        System.out.println("masukan bilangan I = ");
        int x = mahal.nextInt();
        System.out.println("masukan bilangan II = ");
        int y = mahal.nextInt();
        System.out.println("masukan nilai terbesar III = ");
        int z = mahal.nextInt();
        hasil(x,y,z);
        
    }

    
}
