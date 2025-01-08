package Queue;
import java.util.Scanner;
class practic {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter Value of N:");
        //int n=sc.nextInt();
      
        for(int i=1;i<=5;i++){
           for(int j=5;j>=i;j--){
             System.out.print("b");
           }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           for(int j=i;j<=i;j++){
            System.out.println("*");
           }
           System.out.println();
        }
    }
    
}
